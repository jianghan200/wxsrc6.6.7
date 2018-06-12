package com.tencent.mm.storage;

public final class bg
  extends com.tencent.mm.bk.a
{
  public long bJC;
  public long fHP;
  public long sHf;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.bJC);
      paramVarArgs.T(2, this.fHP);
      paramVarArgs.T(3, this.sHf);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.S(1, this.bJC) + 0 + f.a.a.a.S(2, this.fHP) + f.a.a.a.S(3, this.sHf);
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
      bg localbg = (bg)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbg.bJC = locala.vHC.rZ();
        return 0;
      case 2: 
        localbg.fHP = locala.vHC.rZ();
        return 0;
      }
      localbg.sHf = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/storage/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */