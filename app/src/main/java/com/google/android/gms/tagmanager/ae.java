package com.google.android.gms.tagmanager;

final class ae
  extends ad
{
  private static final Object bcq = new Object();
  private static ae bcz;
  private j bcr;
  private volatile i bcs;
  private int bct = 1800000;
  private boolean bcu = true;
  private boolean bcv = false;
  private boolean bcw = true;
  private k bcx = new ae.1(this);
  private boolean bcy = false;
  private boolean connected = true;
  
  public static ae rA()
  {
    if (bcz == null) {
      bcz = new ae();
    }
    return bcz;
  }
  
  /* Error */
  public final void rz()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 40	com/google/android/gms/tagmanager/ae:bcv	Z
    //   6: ifne +14 -> 20
    //   9: invokestatic 68	com/google/android/gms/tagmanager/m:rf	()V
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield 38	com/google/android/gms/tagmanager/ae:bcu	Z
    //   17: aload_0
    //   18: monitorexit
    //   19: return
    //   20: aload_0
    //   21: getfield 70	com/google/android/gms/tagmanager/ae:bcs	Lcom/google/android/gms/tagmanager/i;
    //   24: astore_1
    //   25: new 72	com/google/android/gms/tagmanager/ae$2
    //   28: dup
    //   29: aload_0
    //   30: invokespecial 73	com/google/android/gms/tagmanager/ae$2:<init>	(Lcom/google/android/gms/tagmanager/ae;)V
    //   33: pop
    //   34: goto -17 -> 17
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	42	0	this	ae
    //   24	1	1	locali	i
    //   37	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	17	37	finally
    //   20	34	37	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/tagmanager/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */