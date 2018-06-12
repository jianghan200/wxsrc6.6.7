package com.tencent.mm.model;

public final class bp
  extends com.tencent.mm.bk.a
{
  public String dDi;
  public long dDj;
  public int key;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.key);
      if (this.dDi != null) {
        paramVarArgs.g(2, this.dDi);
      }
      paramVarArgs.T(3, this.dDj);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.key) + 0;
      paramInt = i;
      if (this.dDi != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.dDi);
      }
      return paramInt + f.a.a.a.S(3, this.dDj);
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
      bp localbp = (bp)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbp.key = locala.vHC.rY();
        return 0;
      case 2: 
        localbp.dDi = locala.vHC.readString();
        return 0;
      }
      localbp.dDj = locala.vHC.rZ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/model/bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */