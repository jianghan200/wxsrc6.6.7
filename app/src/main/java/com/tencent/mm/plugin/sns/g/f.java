package com.tencent.mm.plugin.sns.g;

public final class f
  extends com.tencent.mm.bk.a
{
  public int nuZ;
  public long nvb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.T(1, this.nvb);
      paramVarArgs.fT(2, this.nuZ);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.S(1, this.nvb) + 0 + f.a.a.a.fQ(2, this.nuZ);
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
      f localf = (f)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localf.nvb = locala.vHC.rZ();
        return 0;
      }
      localf.nuZ = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */