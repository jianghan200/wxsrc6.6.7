package com.tencent.mm.protocal.c;

public final class ua
  extends com.tencent.mm.bk.a
{
  public String dxh;
  public int mun;
  public String muo;
  public String mup;
  public int muq;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.mun);
      if (this.muo != null) {
        paramVarArgs.g(2, this.muo);
      }
      if (this.mup != null) {
        paramVarArgs.g(3, this.mup);
      }
      paramVarArgs.fT(4, this.muq);
      if (this.dxh != null) {
        paramVarArgs.g(5, this.dxh);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.mun) + 0;
      paramInt = i;
      if (this.muo != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.muo);
      }
      i = paramInt;
      if (this.mup != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.mup);
      }
      i += f.a.a.a.fQ(4, this.muq);
      paramInt = i;
    } while (this.dxh == null);
    return i + f.a.a.b.b.a.h(5, this.dxh);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      ua localua = (ua)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localua.mun = locala.vHC.rY();
        return 0;
      case 2: 
        localua.muo = locala.vHC.readString();
        return 0;
      case 3: 
        localua.mup = locala.vHC.readString();
        return 0;
      case 4: 
        localua.muq = locala.vHC.rY();
        return 0;
      }
      localua.dxh = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ua.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */