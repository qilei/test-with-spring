package com.testwithspring.starter.testdata.javabean;

import org.junit.Test;

public class TaskObjectMotherTest {

    private static final Long ID = 1L;
    private static final Long ASSIGNEE_ID = 99L;
    private static final Long CLOSER_ID = 55L;
    private static final Long CREATOR_ID = 44L;
    private static final String TITLE = "Write an example project";
    private static final String DESCRIPTION = "Write an example project that demonstrates why using the new keyword is a bad idea.";


    @Test
    public void createOpenTaskWithoutAssigneeWithObjectMotherMethodWithoutParameters() {
        Task openTaskWithoutAssignee = TaskFactory.createOpenTaskWithoutAssignee();
    }

    @Test
    public void createOpenTaskWithoutAssigneeWithObjectMotherMethodWithParameters() {
        Task openTaskWithoutAssignee = TaskFactory.createOpenTaskWithoutAssignee(ID,
                ASSIGNEE_ID,
                TITLE,
                DESCRIPTION
        );
    }

    @Test
    public void createOpenTaskWithAssigneeWithObjectMotherMethodWithoutParameters() {
        Task openTaskWithAssignee = TaskFactory.createOpenTaskThatIsAssignedToAssignee();
    }

    @Test
    public void createOpenTaskWithAssigneeWithObjectMotherMethodWithParameters() {
        Task openTaskWithAssignee = TaskFactory.createOpenTaskThatIsAssignedToAssignee(ID,
                ASSIGNEE_ID,
                CREATOR_ID,
                TITLE,
                DESCRIPTION
        );
    }

    @Test
    public void createTaskThatWasClosedAsDuplicateWithObjectMotherMethodWithoutParameters() {
        Task closedAsDuplicate = TaskFactory.createTaskThatWasClosedAsDuplicate();
    }

    @Test
    public void createTaskThatWasClosedAsDuplicateWithObjectMotherMethodWithParameters() {
        Task closedAsDuplicate = TaskFactory.createTaskThatWasClosedAsDuplicate(ID,
                ASSIGNEE_ID,
                CREATOR_ID,
                CLOSER_ID,
                TITLE,
                DESCRIPTION
        );
    }
}
