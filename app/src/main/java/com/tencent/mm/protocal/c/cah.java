package com.tencent.mm.protocal.c;

public final class cah
  extends com.tencent.mm.bk.a
{
  public String eSH;
  public int swD;
  public int swE;
  public int swF;
  public String userName;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.swD);
      paramVarArgs.fT(2, this.swE);
      paramVarArgs.fT(3, this.swF);
      if (this.userName != null) {
        paramVarArgs.g(4, this.userName);
      }
      if (this.eSH != null) {
        paramVarArgs.g(5, this.eSH);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.swD) + 0 + f.a.a.a.fQ(2, this.swE) + f.a.a.a.fQ(3, this.swF);
      paramInt = i;
      if (this.userName != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.userName);
      }
      i = paramInt;
    } while (this.eSH == null);
    return paramInt + f.a.a.b.b.a.h(5, this.eSH);
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
      cah localcah = (cah)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcah.swD = locala.vHC.rY();
        return 0;
      case 2: 
        localcah.swE = locala.vHC.rY();
        return 0;
      case 3: 
        localcah.swF = locala.vHC.rY();
        return 0;
      case 4: 
        localcah.userName = locala.vHC.readString();
        return 0;
      }
      localcah.eSH = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */