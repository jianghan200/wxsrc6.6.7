package com.tencent.mm.protocal.a.a;

public final class a
  extends com.tencent.mm.bk.a
{
  public int count;
  public int qXg;
  public int value;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.qXg);
      paramVarArgs.fT(2, this.value);
      paramVarArgs.fT(3, this.count);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.qXg) + 0 + f.a.a.a.fQ(2, this.value) + f.a.a.a.fQ(3, this.count);
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
      a locala1 = (a)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locala1.qXg = locala.vHC.rY();
        return 0;
      case 2: 
        locala1.value = locala.vHC.rY();
        return 0;
      }
      locala1.count = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */