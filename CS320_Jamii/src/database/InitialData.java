package database;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Account;
import model.Group;
import model.GroupMember;

public class InitialData {
	public static List<Account> getAccounts() throws IOException {
		List<Account> accountList = new ArrayList<Account>();
		ReadCSV readAccounts = new ReadCSV("accounts.csv");
		try {
			// auto-generated primary key for authors table
			Integer userId = 1;
			while (true) {
				List<String> tuple = readAccounts.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Account account = new Account(null, null, userId, null, null, null, false);
				account.setUserId(userId++);
				account.setUsername(i.next());
				account.setPassword(i.next());
				account.setLoginId(Integer.parseInt(i.next()));
				account.setName(i.next());
				account.setEmail(i.next());
				account.setPhoneNumber(i.next());
				accountList.add(account);
			}
			return accountList;
		} finally {
			readAccounts.close();
		}
	}
	
	public static List<Group> getGroups() throws IOException {
		List<Group> groupList = new ArrayList<Group>();
		ReadCSV readGroups = new ReadCSV("groups.csv");
		try {
			// auto-generated primary key for groups table
			Integer groupId = 1;
			while (true) {
				List<String> tuple = readGroups.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				Group group = new Group(null, null, 0);
				group.setGroupId(groupId++);
				group.setName(i.next());
				group.setDescription(i.next());
				group.setRating(Integer.parseInt(i.next()));
				groupList.add(group);
			}
			return groupList;
		} finally {
			readGroups.close();
		}
	}
	
	public static List<GroupMember> getGroupMembers() throws IOException {
		List<GroupMember> groupMemberList = new ArrayList<GroupMember>();
		ReadCSV readGroupMembers = new ReadCSV("groupMembers.csv");
		try {
			// auto-generated primary key for groups table
			Integer memberId = 1;
			while (true) {
				List<String> tuple = readGroupMembers.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				GroupMember groupMember = new GroupMember();
				groupMember.setMemberId(memberId++);
				groupMember.setGroupId(Integer.parseInt(i.next()));
				groupMember.setAccountId(Integer.parseInt(i.next()));
				groupMemberList.add(groupMember);
			}
			return groupMemberList;
		} finally {
			readGroupMembers.close();
		}
	}
}
