    class UnderflowException extends Exception
    {
          //Parameterless Constructor
          public UnderflowException(){}

          //Constructor that accepts a message
          public UnderflowException(String message)
          {
             super(message);
          }
     }