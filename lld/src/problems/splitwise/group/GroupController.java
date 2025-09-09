package problems.splitwise.group;

import problems.splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groups;

    public GroupController() {
        this.groups = new ArrayList<>();
    }

    public void createNewGroup(String groupId, String groupName, User createdByUser) {
        Group group = new Group(groupId, groupName);
        group.addUser(createdByUser);
        groups.add(group);
    }

    public Group getGroup(String groupId) {
        for (Group group : groups) {
            if (group.getGroupId().equals(groupId)) {
                return group;
            }
        }
        return null;
    }
}
