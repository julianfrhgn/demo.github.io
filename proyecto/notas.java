
/**
 * Write a description of class notas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class notas
{
    public static void main (String[] args )
    {
        Scanner sc = new Scanner (System.in);
        int numeroEstudiantes;
        EstudiantePOO[] losEstudaintes = new EstudiantePOO[50];
        String identificacion, nombre, curso;
        double nota1, nota2, nota3;
        double promedio = 0;
        System.out.println("Digite la cantidad de Estdudiantes:  ");
        numeroEstudiantes = nextInt();
        for (int i = 0; i < numeroEstudiantes; i ++)
        {
            System.out.println("Digite la identificacion del estidiante:  ");
            identificacion = sc.next(); 
            System.out.println("Digite el nombre del estidiante:  ");
            nombre = sc.next();
            System.out.println("Digite el curso del estidiante:  ");
            curso  = sc.next();
            System.out.println("Digite la nota1 del estidiante:  ");
            nota1 = sc.nextDouble();
            System.out.println("Digite la nota2 estidiante:  ");
            nota2 = sc.nextDouble();
            System.out.println("Digite la nota3 del estidiante:  ");
            nota3 = sc.nextDouble();
            EstudiantePOO unEstudiante = new EstudiantePOO();
            unEstudiante.identificacion = identificacion;
            unEstudiante.nombre = nombre;
            unEstudiante.curso = curso;
            unEstudiante.notauno = nota1;
            unEstudiante.notados = nota2;
            unEstudiante.notatres = nota3;
            losEstudiantes[i] = unEstudiante;
        }
        
        for (int i = 0; i < numeroEstudiantes; i++) 
        {
            double sum = (losEstudiantes[i].notauno + losEstudiantes[i].notados + losEstududiantes[i].notatres)/3;
            promedio = promedio + sum / numeroEstidudiantes;
        }
        
        System.out.println("El promedio de notas es:  "+ promedio);
    }
}
