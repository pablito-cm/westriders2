package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

public class Tapita {
    
    
        //hardware
        static CANSparkMax MotorTapita;
        
        //lógica
        double speed;
    
        //constructor
        public Tapita(){
            MotorTapita = new CANSparkMax(6, MotorType.kBrushless);
            speed = 0; //aquí dejalo 0, solo cambia la speed en funcioness
        }
    
        //Funciones
        public void nadota(){
            MotorTapita.set(0);
        }
    
        public void abrir(boolean yput){
        if(yput=true){
            speed = 1;
        }
        MotorTapita.set(speed);
        }
    
        public void cerrar(boolean aput){
        if(aput=true){
            speed = -1;
        }
          MotorTapita.set(-speed);
        }










        //AUTONOMO
   public static void AutoIntake(double realtapitaspeedM1){
    MotorTapita.set(+realtapitaspeedM1);
}
    }

