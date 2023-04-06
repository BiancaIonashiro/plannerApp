package org.example;
import model.Project;
import controller.projectController;
import java.util.Date;
import java.sql.SQLException;
import java.util.List;

public class Main {
    private static String List;

    public static void main(String[] args) throws SQLException {
        projectController projectController = new projectController();

        Project project = new Project();
       //project.setName("Projeto teste");//
        project.setId(10);
        project.setName("Novo nome de projeto");
        project.setDescription("description");
        project.setUpdatedAt(new Date()) ;
        //projectController.save(project);//
        projectController.update(project);

        List<Project> projects = projectController.getAll();
        System.out.println("Total de projetos = " + projects.size());

        //projectController.removeById(11);//
    }
}
