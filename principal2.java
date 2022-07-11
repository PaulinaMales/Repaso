import javax.swing.*;

public class principal2 {

    public static void main(String[] args) {

        //AGREGANDO UN COMENTARIO PARA SUBIR A GIT

        Operaciones operacion1 = new Operaciones();



        String opcion = JOptionPane.showInputDialog(null,
                "(1) MULTIPLICAR\n"
                +"(2) SUMAR\n"
                +"(3) PROMEDIAR\n"
                +"(4) MAYOR\n"
                +"(5) SALIR\n","MENU",JOptionPane.QUESTION_MESSAGE);


        //Pedimos datos
        switch (opcion){
            case "1":
                operacion1.pedirDatos();
                JOptionPane.showMessageDialog(null, "La multiplicacion es: "+operacion1.multiplicacion(),"Resultado",JOptionPane.INFORMATION_MESSAGE);
                break;

            case "2":
                operacion1.pedirDatos();
                operacion1.suma();
                break;

            case "3":
                operacion1.pedirDatos();
                operacion1.promedio();
                break;

            case "4":
                operacion1.pedirDatos();
                operacion1.numeroMayor();

                break;
            case "5":
                JOptionPane.showMessageDialog(null,"Hasta pronto");
                System.exit(0);

        }


    }
}
