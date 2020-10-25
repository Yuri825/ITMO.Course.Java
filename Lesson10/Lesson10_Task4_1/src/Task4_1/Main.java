package Task4_1;

public class Main {

    public static void main(String[] args)
    {
        Object object = new Object();
        new Thread41 (object).start();
        new Thread41 (object).start();
    }

  public static class Thread41 extends Thread
  {
      private Object object;

      public Thread41 (Object object)
      {
          this.object = object;
      }

      public void run ()
      {
          while (true)
          {
              synchronized (object)
              {
                  try
                  {
                      System.out.println(getName());
                      object.notify();
                      object.wait();
                  }
                  catch (InterruptedException e)
                  {
                    e.printStackTrace();
                  }
              }
          }
      }
  }
}
