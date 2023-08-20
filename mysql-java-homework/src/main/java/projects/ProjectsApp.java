package projects;

import projects.dao.DbConnection;

public class ProjectsApp {

	public static void main(String[] args) {
		System.out.println(DbConnection.getConnection());
	}
	
}
