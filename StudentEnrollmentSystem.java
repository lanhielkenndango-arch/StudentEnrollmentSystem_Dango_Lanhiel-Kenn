/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentenrollmentsystem;

import javax.swing.SwingUtilities;

/**
 *
 * @author Asus
 */
public class StudentEnrollmentSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // This tells the whole project to use Nimbus before any window opens
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus fails, it will just use the default
        }

        SwingUtilities.invokeLater(() -> {
            new StudentManagementWindow().setVisible(true);
        });
    }

}
