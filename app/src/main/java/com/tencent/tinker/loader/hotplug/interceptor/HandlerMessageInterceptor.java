package com.tencent.tinker.loader.hotplug.interceptor;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.lang.reflect.Field;

public class HandlerMessageInterceptor
  extends Interceptor<Handler.Callback>
{
  private static Field vui = null;
  private final Handler vug;
  private final MessageHandler vuh;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: aconst_null
    //   1: putstatic 23	com/tencent/tinker/loader/hotplug/interceptor/HandlerMessageInterceptor:vui	Ljava/lang/reflect/Field;
    //   4: ldc 2
    //   6: monitorenter
    //   7: getstatic 23	com/tencent/tinker/loader/hotplug/interceptor/HandlerMessageInterceptor:vui	Ljava/lang/reflect/Field;
    //   10: astore_0
    //   11: aload_0
    //   12: ifnonnull +13 -> 25
    //   15: ldc 25
    //   17: ldc 27
    //   19: invokestatic 33	com/tencent/tinker/loader/shareutil/ShareReflectUtil:d	(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   22: putstatic 23	com/tencent/tinker/loader/hotplug/interceptor/HandlerMessageInterceptor:vui	Ljava/lang/reflect/Field;
    //   25: ldc 2
    //   27: monitorexit
    //   28: return
    //   29: astore_0
    //   30: ldc 2
    //   32: monitorexit
    //   33: aload_0
    //   34: athrow
    //   35: astore_0
    //   36: goto -11 -> 25
    // Local variable table:
    //   start	length	slot	name	signature
    //   10	2	0	localField	Field
    //   29	5	0	localObject	Object
    //   35	1	0	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   7	11	29	finally
    //   15	25	29	finally
    //   25	28	29	finally
    //   30	33	29	finally
    //   15	25	35	java/lang/Throwable
  }
  
  public HandlerMessageInterceptor(Handler paramHandler, MessageHandler paramMessageHandler)
  {
    this.vug = paramHandler;
    this.vuh = paramMessageHandler;
  }
  
  private static class CallbackWrapper
    implements Handler.Callback, Interceptor.ITinkerHotplugProxy
  {
    private final HandlerMessageInterceptor.MessageHandler vuh;
    private final Handler.Callback vuj;
    private volatile boolean vuk;
    
    CallbackWrapper(HandlerMessageInterceptor.MessageHandler paramMessageHandler, Handler.Callback paramCallback)
    {
      this.vuh = paramMessageHandler;
      this.vuj = paramCallback;
      this.vuk = false;
    }
    
    public boolean handleMessage(Message paramMessage)
    {
      if (this.vuk) {
        return false;
      }
      this.vuk = true;
      this.vuh.handleMessage(paramMessage);
      if (this.vuj != null) {}
      for (boolean bool = this.vuj.handleMessage(paramMessage);; bool = false)
      {
        this.vuk = false;
        return bool;
      }
    }
  }
  
  public static abstract interface MessageHandler
  {
    public abstract boolean handleMessage(Message paramMessage);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/hotplug/interceptor/HandlerMessageInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */