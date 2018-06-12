package com.tencent.mm.lan_cs;

public final class Client
{
  public static a duF;
  
  public static class C2Java
  {
    public static void onDisconnect(String paramString, int paramInt)
    {
      if (Client.duF != null) {
        Client.duF.Fh();
      }
    }
    
    public static void onRecv(String paramString, int paramInt, byte[] paramArrayOfByte)
    {
      if (Client.duF != null) {
        Client.duF.onRecv(paramString, paramInt, paramArrayOfByte);
      }
    }
  }
  
  public static class Java2C
  {
    public static native void disconnect();
    
    public static native int send(String paramString, int paramInt, byte[] paramArrayOfByte);
  }
  
  public static abstract interface a
  {
    public abstract void Fh();
    
    public abstract void onRecv(String paramString, int paramInt, byte[] paramArrayOfByte);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/lan_cs/Client.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */