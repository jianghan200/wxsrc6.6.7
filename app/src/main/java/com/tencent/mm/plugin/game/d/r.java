package com.tencent.mm.plugin.game.d;

public final class r
  extends com.tencent.mm.bk.a
{
  public String jOZ;
  public int jQa;
  public String jQb;
  public int jQc;
  public int jQd;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.jQa);
      if (this.jQb != null) {
        paramVarArgs.g(2, this.jQb);
      }
      paramVarArgs.fT(3, this.jQc);
      if (this.jOZ != null) {
        paramVarArgs.g(4, this.jOZ);
      }
      paramVarArgs.fT(5, this.jQd);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.jQa) + 0;
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQb);
      }
      i = paramInt + f.a.a.a.fQ(3, this.jQc);
      paramInt = i;
      if (this.jOZ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOZ);
      }
      return paramInt + f.a.a.a.fQ(5, this.jQd);
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
      r localr = (r)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localr.jQa = locala.vHC.rY();
        return 0;
      case 2: 
        localr.jQb = locala.vHC.readString();
        return 0;
      case 3: 
        localr.jQc = locala.vHC.rY();
        return 0;
      case 4: 
        localr.jOZ = locala.vHC.readString();
        return 0;
      }
      localr.jQd = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/d/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */