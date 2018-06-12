package com.tencent.mm.protocal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract interface g
  extends IInterface
{
  public abstract byte[] DE();
  
  public abstract int Df();
  
  public abstract void J(byte[] paramArrayOfByte);
  
  public abstract String LA();
  
  public abstract boolean LB();
  
  public abstract byte[] Lv();
  
  public abstract String Lw();
  
  public abstract String Lx();
  
  public abstract int Ly();
  
  public abstract byte[] Lz();
  
  public abstract boolean a(int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt2, boolean paramBoolean);
  
  public abstract void eK(int paramInt);
  
  public abstract int getClientVersion();
  
  public abstract int getCmdId();
  
  public abstract String getPassword();
  
  public abstract String getUserName();
  
  public abstract void hq(int paramInt);
  
  public abstract void hr(int paramInt);
  
  public abstract void ki(String paramString);
  
  public abstract void kj(String paramString);
  
  public static abstract class a
    extends Binder
    implements g
  {
    public a()
    {
      attachInterface(this, "com.tencent.mm.protocal.IMMBaseReq_AIDL");
    }
    
    public static g aa(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
      if ((localIInterface != null) && ((localIInterface instanceof g))) {
        return (g)localIInterface;
      }
      return new a(paramIBinder);
    }
    
    public IBinder asBinder()
    {
      return this;
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    {
      int j = 0;
      int i = 0;
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        return true;
      case 1: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = paramParcel1.readInt();
        byte[] arrayOfByte1 = paramParcel1.createByteArray();
        byte[] arrayOfByte2 = paramParcel1.createByteArray();
        byte[] arrayOfByte3 = paramParcel1.createByteArray();
        paramInt2 = paramParcel1.readInt();
        if (paramParcel1.readInt() != 0) {}
        for (bool = true;; bool = false)
        {
          bool = a(paramInt1, arrayOfByte1, arrayOfByte2, arrayOfByte3, paramInt2, bool);
          paramParcel2.writeNoException();
          paramInt1 = i;
          if (bool) {
            paramInt1 = 1;
          }
          paramParcel2.writeInt(paramInt1);
          return true;
        }
      case 2: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = Lv();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        return true;
      case 3: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        J(paramParcel1.createByteArray());
        paramParcel2.writeNoException();
        return true;
      case 4: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = DE();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        return true;
      case 5: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        eK(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 6: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = Df();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 7: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        hq(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 8: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = getClientVersion();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 9: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        ki(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 10: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = Lw();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 11: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = Lx();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 12: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        kj(paramParcel1.readString());
        paramParcel2.writeNoException();
        return true;
      case 13: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        hr(paramParcel1.readInt());
        paramParcel2.writeNoException();
        return true;
      case 14: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = Ly();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      case 15: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = Lz();
        paramParcel2.writeNoException();
        paramParcel2.writeByteArray(paramParcel1);
        return true;
      case 16: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = getUserName();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 17: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = getPassword();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 18: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramParcel1 = LA();
        paramParcel2.writeNoException();
        paramParcel2.writeString(paramParcel1);
        return true;
      case 19: 
        paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
        paramInt1 = getCmdId();
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      }
      paramParcel1.enforceInterface("com.tencent.mm.protocal.IMMBaseReq_AIDL");
      boolean bool = LB();
      paramParcel2.writeNoException();
      paramInt1 = j;
      if (bool) {
        paramInt1 = 1;
      }
      paramParcel2.writeInt(paramInt1);
      return true;
    }
    
    private static final class a
      implements g
    {
      private IBinder mRemote;
      
      a(IBinder paramIBinder)
      {
        this.mRemote = paramIBinder;
      }
      
      public final byte[] DE()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(4, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int Df()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(6, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void J(byte[] paramArrayOfByte)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeByteArray(paramArrayOfByte);
          this.mRemote.transact(3, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String LA()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(18, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final boolean LB()
      {
        boolean bool = false;
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(20, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          if (i != 0) {
            bool = true;
          }
          return bool;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] Lv()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(2, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String Lw()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(10, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String Lx()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(11, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int Ly()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(14, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final byte[] Lz()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(15, localParcel1, localParcel2, 0);
          localParcel2.readException();
          byte[] arrayOfByte = localParcel2.createByteArray();
          return arrayOfByte;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      /* Error */
      public final boolean a(int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, byte[] paramArrayOfByte3, int paramInt2, boolean paramBoolean)
      {
        // Byte code:
        //   0: iconst_1
        //   1: istore 7
        //   3: invokestatic 27	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   6: astore 8
        //   8: invokestatic 27	android/os/Parcel:obtain	()Landroid/os/Parcel;
        //   11: astore 9
        //   13: aload 8
        //   15: ldc 29
        //   17: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
        //   20: aload 8
        //   22: iload_1
        //   23: invokevirtual 75	android/os/Parcel:writeInt	(I)V
        //   26: aload 8
        //   28: aload_2
        //   29: invokevirtual 58	android/os/Parcel:writeByteArray	([B)V
        //   32: aload 8
        //   34: aload_3
        //   35: invokevirtual 58	android/os/Parcel:writeByteArray	([B)V
        //   38: aload 8
        //   40: aload 4
        //   42: invokevirtual 58	android/os/Parcel:writeByteArray	([B)V
        //   45: aload 8
        //   47: iload 5
        //   49: invokevirtual 75	android/os/Parcel:writeInt	(I)V
        //   52: iload 6
        //   54: ifeq +59 -> 113
        //   57: iconst_1
        //   58: istore_1
        //   59: aload 8
        //   61: iload_1
        //   62: invokevirtual 75	android/os/Parcel:writeInt	(I)V
        //   65: aload_0
        //   66: getfield 18	com/tencent/mm/protocal/g$a$a:mRemote	Landroid/os/IBinder;
        //   69: iconst_1
        //   70: aload 8
        //   72: aload 9
        //   74: iconst_0
        //   75: invokeinterface 39 5 0
        //   80: pop
        //   81: aload 9
        //   83: invokevirtual 42	android/os/Parcel:readException	()V
        //   86: aload 9
        //   88: invokevirtual 53	android/os/Parcel:readInt	()I
        //   91: istore_1
        //   92: iload_1
        //   93: ifeq +25 -> 118
        //   96: iload 7
        //   98: istore 6
        //   100: aload 9
        //   102: invokevirtual 48	android/os/Parcel:recycle	()V
        //   105: aload 8
        //   107: invokevirtual 48	android/os/Parcel:recycle	()V
        //   110: iload 6
        //   112: ireturn
        //   113: iconst_0
        //   114: istore_1
        //   115: goto -56 -> 59
        //   118: iconst_0
        //   119: istore 6
        //   121: goto -21 -> 100
        //   124: astore_2
        //   125: aload 9
        //   127: invokevirtual 48	android/os/Parcel:recycle	()V
        //   130: aload 8
        //   132: invokevirtual 48	android/os/Parcel:recycle	()V
        //   135: aload_2
        //   136: athrow
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	137	0	this	a
        //   0	137	1	paramInt1	int
        //   0	137	2	paramArrayOfByte1	byte[]
        //   0	137	3	paramArrayOfByte2	byte[]
        //   0	137	4	paramArrayOfByte3	byte[]
        //   0	137	5	paramInt2	int
        //   0	137	6	paramBoolean	boolean
        //   1	96	7	bool	boolean
        //   6	125	8	localParcel1	Parcel
        //   11	115	9	localParcel2	Parcel
        // Exception table:
        //   from	to	target	type
        //   13	52	124	finally
        //   59	92	124	finally
      }
      
      public final IBinder asBinder()
      {
        return this.mRemote;
      }
      
      public final void eK(int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(5, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int getClientVersion()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(8, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final int getCmdId()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(19, localParcel1, localParcel2, 0);
          localParcel2.readException();
          int i = localParcel2.readInt();
          return i;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String getPassword()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(17, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final String getUserName()
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          this.mRemote.transact(16, localParcel1, localParcel2, 0);
          localParcel2.readException();
          String str = localParcel2.readString();
          return str;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void hq(int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(7, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void hr(int paramInt)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeInt(paramInt);
          this.mRemote.transact(13, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void ki(String paramString)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(9, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
      
      public final void kj(String paramString)
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        try
        {
          localParcel1.writeInterfaceToken("com.tencent.mm.protocal.IMMBaseReq_AIDL");
          localParcel1.writeString(paramString);
          this.mRemote.transact(12, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
        }
        finally
        {
          localParcel2.recycle();
          localParcel1.recycle();
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */