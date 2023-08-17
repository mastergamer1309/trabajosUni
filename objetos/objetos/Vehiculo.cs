using static System.Console;
namespace objetos
{
    class Vehiculo
    {
        //Atributos
        
        string Marca { get; set; }
        string Modelo { get; set; }
        string Color { get; set; }
        string llantas { get; set; }
        string Placa { get; set; }
        string Motor { get; set; }
        string Vin { get; set; }


        //metodos

        //CRUD

        public void CreateVehicle()
        {
            Vehiculo vehiculo = new Vehiculo();
            Write("ingrese Marca");
            vehiculo.Marca = ReadLine();

            Write("ingrese Modelo");
            vehiculo.Modelo = ReadLine();

            Write("ingrese Color");
            vehiculo.Color = ReadLine();
            
            Write("ingrese Llantas");
            vehiculo.llantas = ReadLine();
            
            Write("ingrese Placa");
            vehiculo.Placa = ReadLine();
            
            Write("ingrese Motor");
            vehiculo.Motor = ReadLine();
            
            Write("ingrese Vin");
            vehiculo.Vin = ReadLine();

            WriteLine();




        }

        public void ReadVehicle()
        {
            WriteLine(Marca);
            Write(Modelo);
            Write(Color);
            Write(llantas);
            Write(Placa);
            Write(Motor);
            Write(Vin);
            WriteLine();

        }
    }
}
