
/**
 * Un ejemplo que modela un Televisor simple usando POO
 * 
 * @author (Milton Jesús Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Televisor
{
   /**
    * Tipo de entrada
 	*   0 = Apagado
 	*   1 = Antena (maximo 13 canales)
 	*   2 = Cable (el maximo de canales es 100)
 	*   3 = Auxiliar (DVD, VH, etc), un canal
    **/
   protected int tipoDeEntrada;
   
   /**Volumen del televisor*/
   protected int volumen;
   
   /**
    * Canal sintonizado, si la entrada es auxiliar, el canal es el 1, 2 ó 3
    **/
   protected int canal;
   
   /**Constante maximo volumen*/
   public static final int maximoVolumen = 20;
   
   /**Constante tipo de entarda apagado*/
   public static final int apagado = 0;
   
   /**Constante tipo de entarda antena*/
   public static final int antena = 1;
   
   /**Constante tipo de entarda cable*/
   public static final int cable = 2;
   
   /**Constante tipo de entarda auxiliar*/
   public static final int auxiliar = 3;
   
   /**Arreglo constante con nombres de cada entrada*/
   public static final String [] tiposDeEntrada = {"Apagado", "Antena", "Cable", "Auxiliar"};
   

   /**Constructor que inicializa con valores por defecto*/
   public Televisor()
   {
   }//Fin constructor default

   /***
    * Construye un televisor inicializando sus propiedades con los parámetros recibidos
    * @param    tipoDeEntrada valor inicial de la propiedad tipoDeEntrada
    * @param    volumen valor inicial de la propiedad volumen
    * @param    canal valor inicial de la propiedad canal
    */
   public Televisor(int tipoDeEntrada, int volumen,int canal)
   {
     this.tipoDeEntrada=tipoDeEntrada;
     this.canal=canal;
     this.volumen=volumen;
    }//Fin constructor con parámetros

    /***
     * Sube el volumen del televisor
     * @return  true si pudo subirlo, false si llegó al máximo
     */
    public boolean subirVolumen()
    {
       boolean sePuedeSubir;
       if(volumen >= 0 && volumen < maximoVolumen)
       {
           volumen ++ ;
        return sePuedeSubir = true;
    }
       //COMPLETE EL ALGORITMO
       else return sePuedeSubir = false;
       //COMPLETE EL ALGORITMO
    }//fin método subirVolumen
    
    /***
     * Baja el volumen del televisor
     * @return  true si pudo bajar, false si llegó al mínimo (0)
     */
    public boolean bajarVolumen()
    {
      boolean sePuedeBajar;
        if(volumen > 0 && volumen <= maximoVolumen)
       {
           volumen -- ;
        return sePuedeBajar = true;
    }
       //COMPLETE EL ALGORITMO
       else return sePuedeBajar = false;
       
    }//fin método bajarVolumen
    
    /***
     * Avanza el canal del televisor, si llega al máximo regresa al mínimo
     */
    public void avanzarCanal()
    {
      //COMPLETE EL ALGORITMO
      
      if(canal == getMaximoCanal())
      {if(getMaximoCanal() == 13 || getMaximoCanal() == 100 || getMaximoCanal() == 3)
       {   
      canal = 1;
    }
    else if (getMaximoCanal() == 0)
    {canal=0;
    }}
      else canal++;
      
    }//fin método subirVolumen
    
    /***
     * Retrocede el canal del televisor, si llega al mínimo pasa al máximo
     */
    public void retrocederCanal()
    {
      //COMPLETE EL ALGORITMO
      if(canal == 1)
      {
          if(getMaximoCanal() == 13 || getMaximoCanal() == 100 || getMaximoCanal() == 3 || getMaximoCanal() == 0)
      
       {   
      canal = getMaximoCanal();
}}
else if (canal == 0)
{canal=getMaximoCanal();
}

      else canal--;
    }//fin método subirVolumen        
    
    /**
     * Método de acceso al canal máximo según la entrada
     * @return el valor del máximo canal
     */
    public int getMaximoCanal()
    {
        
      int maximoCanal = 0;
      if(tipoDeEntrada == apagado)
      { maximoCanal=0;
          
        }
        else if (tipoDeEntrada == antena)
        {maximoCanal=13;
           
        }
        else if(tipoDeEntrada == cable)
        {maximoCanal=100;
            
        }
        else if(tipoDeEntrada == auxiliar)
        {maximoCanal=3;
            
        }
      //COMPLETE EL ALGORITMO
      return maximoCanal;
    }//fin getVolumen
    
    /**
     * Método de acceso a la propiedad volumen
     * @return el valor de volumen para éste objeto Televisor
     */
    public int getVolumen()
    {
      return this.volumen;
    }//fin getVolumen
    
    /***
     * Método para modificación de la propiedad volumen
     * @param   volumen el nuevo valor de la propiedad volumen
     */
    public void setVolumen(int volumen)
    {
       this.volumen = volumen;
    }//fin setVolumen   
    
    /**
     * Método de acceso a la propiedad canal
     * @return el valor de canal para éste objeto Televisor
     */
    public int getCanal()
    {
       return this.canal;
    }//fin getCanal
    
    /***
     * Método para modificación de la propiedad canal
     * @param   canal el nuevo valor de la propiedad canal
     */
    public void setCanal(int canal)
    {
       this.canal = canal;
    }//fin setCanal
    
    /**
     * Método de acceso a la propiedad tipoDeEntrada
     * @return el valor de tipoDeEntrada para éste objeto Televisor
     */
    public String getTipoDeEntrada()
    {
       String rta = null;
       //COMPLETE EL ALGORITMO
       if(tipoDeEntrada == 0)
      { rta= "Apagado";
          
        }
        else if (tipoDeEntrada == 1)
        {rta="Antena";
           
        }
        else if(tipoDeEntrada == 2)
        {rta="cable";
            
        }
        else if(tipoDeEntrada == 3)
        {rta="auxiliar";
            
        }
      //COMPLETE EL ALGORITMO
       return rta;
    }//fin getTipoDeEntrada
    
    /***
     * Método para modificación de la propiedad tipoDeEntrada
     * @param   tipoDeEntrada el nuevo valor de la propiedad tipoDeEntrada
     */
    public void setTipoDeEntrada(int tipoDeEntrada)
    {
      //COMPLETE EL ALGORITMO
      this.tipoDeEntrada = tipoDeEntrada;
    }//fin setTipoDeEntrada
    
   
    /***
     * Regresa una cadena String con los datos del Televisor
     * @override java.lang.Object.toString
     */
    public String toString()
    {
      String str = "\n**********Televisor**********\n";
      str = str + "Entrada: " + this.getTipoDeEntrada()+"\n";
      str = str + "Canal: "  + this.getCanal()+"\n";
      str = str + "Volumen: "  + this.getVolumen()+"\n";
      return str;
    }//fin toString
    
}//fin clase Televisor