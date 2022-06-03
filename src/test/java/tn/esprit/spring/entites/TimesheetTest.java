package tn.esprit.spring.entites;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tn.esprit.spring.controller.LoggingController;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.repository.TimesheetRepository;
import tn.esprit.spring.services.ITimesheetService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TimesheetTest {

    @Autowired
    ITimesheetService timesheetService;
    @Autowired
    TimesheetRepository timesheetRepository;

    Logger logger = LogManager.getLogger(LoggingController.class);

    @Test
    public void testAddMission() {
        logger.info("test method addMission");
        Mission mission = new Mission("name","desc");
        int id = timesheetService.ajouterMission(mission);
        logger.warn("add mission id = "+id);
        Assert.assertNotEquals(-1, id);
    }






}
