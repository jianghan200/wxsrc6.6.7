package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class ceb
  extends com.tencent.mm.bk.a
{
  public int jTt;
  public String svH;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.svH == null) {
        throw new b("Not all required fields were included: Data");
      }
      paramVarArgs.fT(1, this.jTt);
      if (this.svH != null) {
        paramVarArgs.g(2, this.svH);
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
      i = f.a.a.a.fQ(1, this.jTt) + 0;
      paramInt = i;
    } while (this.svH == null);
    return i + f.a.a.b.b.a.h(2, this.svH);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.svH == null) {
        throw new b("Not all required fields were included: Data");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      ceb localceb = (ceb)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localceb.jTt = locala.vHC.rY();
        return 0;
      }
      localceb.svH = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ceb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */