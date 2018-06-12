package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class eq
  extends com.tencent.mm.bk.a
{
  public LinkedList<String> rfd = new LinkedList();
  public int rfe;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.d(1, 1, this.rfd);
      paramVarArgs.fT(2, this.rfe);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.c(1, 1, this.rfd) + 0 + f.a.a.a.fQ(2, this.rfe);
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.rfd.clear();
      paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
      eq localeq = (eq)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localeq.rfd.add(locala.vHC.readString());
        return 0;
      }
      localeq.rfe = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */