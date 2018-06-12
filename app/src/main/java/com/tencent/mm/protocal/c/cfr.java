package com.tencent.mm.protocal.c;

public final class cfr
  extends com.tencent.mm.bk.a
{
  public boolean sAi;
  public boolean sAj;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.av(1, this.sAi);
      paramVarArgs.av(2, this.sAj);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.b.b.a.ec(1) + 1 + 0 + (f.a.a.b.b.a.ec(2) + 1);
    }
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
      cfr localcfr = (cfr)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcfr.sAi = locala.cJQ();
        return 0;
      }
      localcfr.sAj = locala.cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cfr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */