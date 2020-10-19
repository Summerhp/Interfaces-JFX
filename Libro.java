/**
 * Estudiante: Jaider Cardenas Codigo: 1152048
 * Un ejemplo POO para controlar el pr?stamo de las copias de un Libro.
 * 
 * Todos los atributos se declaran con el modificador "protected" (concepto de encapsulamiento).
 * 
 * Para cada uno de los atributos o propiedades b?sicas se crean m?todos
 * GET (para acceder al valor) y SET (para modificar el valor).
 * 
 * Los demas m?todos diferentes a GET/SET corresponde a funcionalidades 
 * espec?ficas de los requerimientos:
 * 
 * Req1: Consultar la cantidad de copias disponibles para prestar.
 * Corresponde a la resta entre numeroDeCopias y numeroDeCopiasPrestadas
 * 
 * Req2: Registrar el pr?stamo de una copia del libro.
 * 
 * Req3: Registrar la devoluci?n de una copia prestada.
 * 
 * Req4: Cambiar la cantidad de copias del libro, evitando inconsistencias.
 * numeroDeCopias no puede ser menor que numeroDeCopiasPrestadas ?por qu??
 * 
 * @author (Milton Jes?s Vera Contreras - miltonjesusvc@ufps.edu.co)
 * @version 0.000000000000001 :) --> Math.sin(Math.PI-Double.MIN_VALUE)
 */
public class Libro
{
    
   /**T?tulo del libro*/
   //COMPLETE
   String Titulo = "La Libertad"; 
   /**Nombre de la Empresa editorial*/
   //COMPLETE
   String NEmpresa = "Lindos y Leibles";
   /**Nombre de los autores*/
   //COMPLETE
   String NomAut = "Jose Eustaquio y Marlo Aprilino";
   /**a?o en que fu? impreso el libro*/
   //COMPLETE
   int año = 2019; 
   /**Cantidad de hojas-p?ginas del libro*/
   //COMPLETE
   int Cpaginas = 200 ;
   /**Valor en que se compr? el libro*/
   //COMPLETE
   int valor = 1200; 
   /**Cantidad de ejemplares-copias del libro*/   
   //COMPLETE
   int copias = 10;
   /**Cantidad de ejemplares-copias prestados*/
   //COMPLETE
   int copiasP;
   /**M?todo Constructor que inicializa con valores por defecto*/
   public Libro()
   {
     //COMPLETE
   }//Fin constructor default

   /***
    * M?todo Construye que inicializa las propiedades con los par?metros recibidos
    * @param    titulo valor inicial de la propiedad titulo
    * @param    editorial valor inicial de la propiedad editorial
    * @param    autores valor inicial de la propiedad autores
    * @param    a?oEdicion valor inicial de la propiedad a?oEdicion 
    * @param    numeroDePaginas valor inicial de la propiedad numeroDePaginas
    * @param    precio valor inicial de la propiedad precio
    * @param    numeroDeCopias valor inicial de la propiedad numeroDeCopias
    */
   public Libro(int añoEdicion, int numeroDePaginas,int precio, String titulo, String editorial,String autores, int numeroDeCopias)
   {
     //COMPLETE
     this.año = añoEdicion;
     this.Cpaginas = numeroDePaginas;
     this.valor =  precio;
     this.Titulo = titulo; 
     this.NEmpresa = editorial;
     this.NomAut = autores;
     this.copias = numeroDeCopias;
    }//Fin constructor con par?metros
    
    /**
     * M?todo de acceso a la propiedad titulo
     * @return el valor de titulo para ?ste objeto Libro
     */
    public String getTitulo()
    {
       //COMPLETE
       return Titulo;
    }//fin getTitulo

    /***
     * M?todo para modificaci?n de la propiedad titulo
     * @param   titulo el nuevo valor de la propiedad titulo
     */
    public void setTitulo(String titulo)
    {
      //COMPLETE
      this.Titulo = titulo; 
    }//fin setTitulo
    
    /**
     * M?todo de acceso a la propiedad editorial
     * @return el valor de editorial para ?ste objeto Libro
     */
    public String getEditorial()
    {
       //COMPLETE
       return NEmpresa;
    }//fin getEditorial
    
        /***
     * M?todo para modificaci?n de la propiedad editorial
     * @param   editorial el nuevo valor de la propiedad editorial
     */    
    public void setEditorial(String editorial)
    {
      //COMPLETE
      this.NEmpresa = editorial;
    }//fin setEditorial
    
    /**
     * M?todo de acceso a la propiedad autores
     * @return el valor de autores para ?ste objeto Libro
     */
    public String getAutores()
    {
       //COMPLETE
       return NomAut;
    }//fin getAutores
    
    /***
     * M?todo para modificaci?n de la propiedad autores
     * @param   autores el nuevo valor de la propiedad autores
     */ 
    public void setAutores(String autores)
    {
      //COMPLETE
      this.NomAut = autores;
    }//fin setAutores
        
    /**
     * M?todo de acceso a la propiedad a?oEdicion
     * @return el valor de a?oEdicion para ?ste objeto Libro
     */
    public int getAñoEdicion()
    {
       //COMPLETE
       return año;
    }//fin getA?oEdicion

        /***
     * M?todo para modificaci?n de la propiedad a?oEdicion
     * @param   a?oEdicion el nuevo valor de la propiedad a?oEdicion
     */
    public void setAñoEdicion(int añoEdicion)
    {
      //COMPLETE
      this.año =  añoEdicion;
    }//fin setA?oEdicion
    
    /**
     * M?todo de acceso a la propiedad numeroDePaginas
     * @return el valor de numeroDePaginas para ?ste objeto Libro
     */
    public int getNumeroDePaginas()
    {
       //COMPLETE
       return Cpaginas;
    }//fin getNumeroDePaginas

        /***
     * M?todo para modificaci?n de la propiedad numeroDePaginas
     * @param   numeroDePaginas el nuevo valor de la propiedad numeroDePaginas
     */
    public void setNumeroDePaginas(int numeroDePaginas)
    {
       //COMPLETE
       Cpaginas = numeroDePaginas;
    }//fin setNumeroDePaginas
    
    /**
     * M?todo de acceso a la propiedad precio
     * @return el valor de precio para ?ste objeto Libro
     */
    public int getPrecio()
    {
       //COMPLETE
       return valor;
    }//fin getPrecio
        
    /***
     * M?todo para modificaci?n de la propiedad precio
     * @param   precio el nuevo valor de la propiedad precio
     */
    public void setPrecio(int precio)
    {
      //COMPLETE
      valor = precio;
    }//fin setPrecio
       
    /**
     * M?todo de acceso a la propiedad numeroDeCopias
     * @return el valor de numeroDeCopias para ?ste objeto Libro
     */
    public int getNumeroDeCopias()
    {
       //COMPLETE
       return copias;
    }//fin getNumeroDeCopias
    
    /**
     * M?todo de acceso a la propiedad numeroDeCopiasPrestadas
     * @return el valor de numeroDeCopiasPrestadas para ?ste objeto Libro
     */
    public int getNumeroDeCopiasPrestadas()
    {
      //COMPLETE
      return copiasP;
    }//fin getNumeroDeCopiasPestadas

    /*
     * No hay m?todo SET para numeroDeCopiasPrestadas pues ?sta propiedad
     * se modifica al prestar (Req2) y devolver (Req3).
     * No hay m?todo SET para numeroDeCopias, en su lugar el m?todo cambiarNumeroDeCopias (Req4)
    */
    
    /*--- Desde aqu? comienzan los m?todos para satisfacer los Requerimientos---*/
    
    /**
     * Determina la cantidad de copias disponibles para prestar (Req1)
     * @return  la diferencia entre la cantidad de copias y la cantidad de prestamos
     */
    public int getNumeroDeCopiasDisponibles()
    {
      //COMPLETE
      int copiasD = 0;
      copiasD = copias - copiasP;
      return copiasD;
    }//fin getNumeroDeCopiasDisponibles
    
    /***
     * Registra el pr?stamo de una de las copias de este libro (Req2)
     * @return  true si pudo registrar el prestamo, false si no.
     */
    public boolean prestar()
    {
       //COMPLETE
       if(getNumeroDeCopiasDisponibles() > 0){
    copiasP++;
    getNumeroDeCopiasDisponibles();
    return true;
    } else return false;
    
    }//fin m?todo prestar

    /***
     * Registra la devoluci?n de una de las copias de este libro (Req3)
     * @return  true si pudo registrar la devoluci?n, false si no.
     */
    public boolean devolver()
    {
       //COMPLETE
       if(getNumeroDeCopiasPrestadas() > 0)
       {
       copiasP --;
       getNumeroDeCopiasDisponibles(); //actulizar el valor de numero de copias disponibles
       return true;
    } else return false;
       
       
    }//fin m?todo devolver
    
    /***
     * M?todo para modificaci?n de la propiedad numeroDeCopias. (Req4)
     * Controla que no se reduzca numeroDeCopias a un valor inconsistente:  
     * numeroDeCopias no puede ser menor que numeroDeCopiasPrestadas
     * @param   numeroDeCopias el nuevo valor de la propiedad numeroDeCopias
     * @return true si pudo cambiar el valor, false si no se pudo. 
     */ 
    public boolean cambiarNumeroDeCopias(int numeroDeCopias)
    {
      //COMPLETE
      if(numeroDeCopias >= copiasP)
    {
     copias = numeroDeCopias;
     return true;
    } else return false;
     
    }//fin setNumeroDeCopias
    
    /***
     * Regresa una cadena String con los datos del Libro
     * @override java.lang.Object.toString
     */
    public String toString()
    {
      String str = "\n**********Libro**********\n";
      str = str + "Titulo: " + this.getTitulo()+"\n";
      str = str + "Autores: "  + this.getAutores()+"\n";
      str = str + "Editorial: "  + this.getEditorial()+"\n";
      str = str + "Año: "  + this.getAñoEdicion()+"\n";
      str = str + "Paginas: "  + this.getNumeroDePaginas()+"\n";
      str = str + "Precio: "  + this.getPrecio()+"\n";      
      str = str + "Copias: "  + this.getNumeroDeCopias()+"\n";
      str = str + "Copias Disponibles: "  + this.getNumeroDeCopiasDisponibles()+"\n";
      str = str + "Copias Prestadas: "  + this.getNumeroDeCopiasPrestadas()+"\n";
      return str;
    }
    
}//fin clase Libro