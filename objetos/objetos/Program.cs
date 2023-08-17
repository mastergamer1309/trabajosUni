using static System.Console;
using System;

namespace objetos
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            Vehiculo hola = new Vehiculo();
                Vehiculo[] vehiculos = new Vehiculo[2];
            int option = 0;
            
            do
            {
                WriteLine("***Menu***");
                WriteLine("1. registrar vehiculos");
                WriteLine("2. Mostrar vehiculos");
                WriteLine("0 - salir");
                option = int.Parse(ReadLine());


                
                switch(option)
                {
                    case 1:
                        WriteLine("registrar");
                        for (int i = 0; i < vehiculos.Length; i++)
                        {
                            Vehiculo vehiculo = new Vehiculo();
                            WriteLine("vehiculo #" + (i+1));
                            vehiculos[i] = new Vehiculo();
                            vehiculos[i].CreateVehicle();
                            

                        }
                        break;

                    case 2:
                        WriteLine("mostrar vehiculos \n\n");
                        for(int i = 0;i < vehiculos.Length; i++)
                        {
                            WriteLine("Vehiculo #" + (i+1));
                            vehiculos[i].ReadVehicle();
                        }
                        break;

                    default:
                        WriteLine("seleccione una opcion valida");
                        break;
                }


            } while (option != 0);
        }
    }
}
