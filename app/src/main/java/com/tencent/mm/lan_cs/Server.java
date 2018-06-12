package com.tencent.mm.lan_cs;

public final class Server
{
  public static a duG;
  
  public static class C2Java
  {
    public static void onConnect(String paramString, int paramInt)
    {
      if (Server.duG != null) {
        Server.duG.onConnect(paramString, paramInt);
      }
    }
    
    public static void onDisconnect(String paramString, int paramInt)
    {
      if (Server.duG != null) {
        Server.duG.Fh();
      }
    }
    
    public static void onRecv(String paramString, int paramInt, byte[] paramArrayOfByte)
    {
      if (Server.duG != null) {
        Server.duG.onRecv(paramString, paramInt, paramArrayOfByte);
      }
    }
    
    public static void onSend(String paramString, int paramInt1, int paramInt2)
    {
      if (Server.duG != null) {
        Server.duG.gO(paramInt2);
      }
    }
  }
  
  public static class Java2C
  {
    public static native int send(String paramString, int paramInt, byte[] paramArrayOfByte);
    
    private static native Object[] start();
    
    public static native void stop();
  }
  
  public static abstract interface a
  {
    public abstract void Fh();
    
    public abstract void gO(int paramInt);
    
    public abstract void onConnect(String paramString, int paramInt);
    
    public abstract void onRecv(String paramString, int paramInt, byte[] paramArrayOfByte);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/lan_cs/Server.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */