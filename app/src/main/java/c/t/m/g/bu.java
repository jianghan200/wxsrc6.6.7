package c.t.m.g;

final class bu
  implements Runnable
{
  bu(bp parambp) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: invokestatic 24	c/t/m/g/p:e	()V
    //   3: invokestatic 28	c/t/m/g/p:b	()Ljava/lang/String;
    //   6: astore 4
    //   8: aload_0
    //   9: getfield 12	c/t/m/g/bu:a	Lc/t/m/g/bp;
    //   12: aload 4
    //   14: invokestatic 33	c/t/m/g/bp:a	(Lc/t/m/g/bp;Ljava/lang/String;)Lc/t/m/g/bp$a;
    //   17: astore 4
    //   19: invokestatic 39	android/os/SystemClock:elapsedRealtime	()J
    //   22: lstore_2
    //   23: aload 4
    //   25: getfield 44	c/t/m/g/bp$a:b	I
    //   28: invokestatic 47	c/t/m/g/bp:b	(I)I
    //   31: istore_1
    //   32: lload_2
    //   33: aload 4
    //   35: getfield 50	c/t/m/g/bp$a:a	J
    //   38: lsub
    //   39: iload_1
    //   40: i2l
    //   41: lcmp
    //   42: ifle +38 -> 80
    //   45: aload_0
    //   46: getfield 12	c/t/m/g/bu:a	Lc/t/m/g/bp;
    //   49: invokestatic 53	c/t/m/g/bp:b	(Lc/t/m/g/bp;)Landroid/os/Handler;
    //   52: aload_0
    //   53: getfield 12	c/t/m/g/bu:a	Lc/t/m/g/bp;
    //   56: invokestatic 56	c/t/m/g/bp:a	(Lc/t/m/g/bp;)Ljava/lang/Runnable;
    //   59: invokevirtual 62	android/os/Handler:removeCallbacks	(Ljava/lang/Runnable;)V
    //   62: aload_0
    //   63: getfield 12	c/t/m/g/bu:a	Lc/t/m/g/bp;
    //   66: invokestatic 53	c/t/m/g/bp:b	(Lc/t/m/g/bp;)Landroid/os/Handler;
    //   69: aload_0
    //   70: getfield 12	c/t/m/g/bu:a	Lc/t/m/g/bp;
    //   73: invokestatic 56	c/t/m/g/bp:a	(Lc/t/m/g/bp;)Ljava/lang/Runnable;
    //   76: invokevirtual 66	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   79: pop
    //   80: return
    //   81: astore 4
    //   83: aload 4
    //   85: athrow
    //   86: astore 4
    //   88: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	89	0	this	bu
    //   31	9	1	i	int
    //   22	11	2	l	long
    //   6	28	4	localObject1	Object
    //   81	3	4	localObject2	Object
    //   86	1	4	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   0	80	81	finally
    //   0	80	86	java/lang/Throwable
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */