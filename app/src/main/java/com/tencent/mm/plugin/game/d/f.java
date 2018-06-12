package com.tencent.mm.plugin.game.d;

public final class f
  extends com.tencent.mm.bk.a
{
  public int jPu;
  public int jPv;
  public int jPw;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.jPu);
      paramVarArgs.fT(2, this.jPv);
      paramVarArgs.fT(3, this.jPw);
      return 0;
    }
    if (paramInt == 1) {
      return f.a.a.a.fQ(1, this.jPu) + 0 + f.a.a.a.fQ(2, this.jPv) + f.a.a.a.fQ(3, this.jPw);
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
        localf.jPu = locala.vHC.rY();
        return 0;
      case 2: 
        localf.jPv = locala.vHC.rY();
        return 0;
      }
      localf.jPw = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */