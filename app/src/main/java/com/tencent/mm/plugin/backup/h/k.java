package com.tencent.mm.plugin.backup.h;

import f.a.a.b;

public final class k
  extends com.tencent.mm.bk.a
{
  public int hbJ;
  public int hbK;
  public String hbL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL == null) {
        throw new b("Not all required fields were included: UserName");
      }
      paramVarArgs.fT(1, this.hbJ);
      paramVarArgs.fT(2, this.hbK);
      if (this.hbL != null) {
        paramVarArgs.g(3, this.hbL);
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
      i = f.a.a.a.fQ(1, this.hbJ) + 0 + f.a.a.a.fQ(2, this.hbK);
      paramInt = i;
    } while (this.hbL == null);
    return i + f.a.a.b.b.a.h(3, this.hbL);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.hbL == null) {
        throw new b("Not all required fields were included: UserName");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      k localk = (k)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localk.hbJ = locala.vHC.rY();
        return 0;
      case 2: 
        localk.hbK = locala.vHC.rY();
        return 0;
      }
      localk.hbL = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/backup/h/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */