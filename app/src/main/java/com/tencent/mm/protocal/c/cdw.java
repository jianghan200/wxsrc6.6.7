package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class cdw
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jSA;
  public int jTt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jSA == null) {
        throw new b("Not all required fields were included: Content");
      }
      paramVarArgs.fT(1, this.jTt);
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.jSA != null) {
        paramVarArgs.g(3, this.jSA);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.jTt) + 0;
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
    } while (this.jSA == null);
    return paramInt + f.a.a.b.b.a.h(3, this.jSA);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jSA == null) {
        throw new b("Not all required fields were included: Content");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      cdw localcdw = (cdw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcdw.jTt = locala.vHC.rY();
        return 0;
      case 2: 
        localcdw.bHD = locala.vHC.readString();
        return 0;
      }
      localcdw.jSA = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cdw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */