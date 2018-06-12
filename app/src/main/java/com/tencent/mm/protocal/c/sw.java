package com.tencent.mm.protocal.c;

public final class sw
  extends com.tencent.mm.bk.a
{
  public boolean rwc;
  public boolean rwd;
  public String rwe;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.av(1, this.rwc);
      paramVarArgs.av(2, this.rwd);
      if (this.rwe != null) {
        paramVarArgs.g(3, this.rwe);
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
      i = f.a.a.b.b.a.ec(1) + 1 + 0 + (f.a.a.b.b.a.ec(2) + 1);
      paramInt = i;
    } while (this.rwe == null);
    return i + f.a.a.b.b.a.h(3, this.rwe);
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
      sw localsw = (sw)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localsw.rwc = locala.cJQ();
        return 0;
      case 2: 
        localsw.rwd = locala.cJQ();
        return 0;
      }
      localsw.rwe = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/sw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */