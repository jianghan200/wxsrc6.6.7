package com.tencent.mm.plugin.game.d;

public final class n
  extends com.tencent.mm.bk.a
{
  public String jOS;
  public String jOU;
  public String jPM;
  public int jPN;
  public String jPe;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPM != null) {
        paramVarArgs.g(1, this.jPM);
      }
      if (this.jPe != null) {
        paramVarArgs.g(2, this.jPe);
      }
      if (this.jOS != null) {
        paramVarArgs.g(3, this.jOS);
      }
      if (this.jOU != null) {
        paramVarArgs.g(4, this.jOU);
      }
      paramVarArgs.fT(5, this.jPN);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPM == null) {
        break label379;
      }
    }
    label379:
    for (int i = f.a.a.b.b.a.h(1, this.jPM) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPe != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPe);
      }
      i = paramInt;
      if (this.jOS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jOS);
      }
      paramInt = i;
      if (this.jOU != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOU);
      }
      return paramInt + f.a.a.a.fQ(5, this.jPN);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        n localn = (n)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localn.jPM = locala.vHC.readString();
          return 0;
        case 2: 
          localn.jPe = locala.vHC.readString();
          return 0;
        case 3: 
          localn.jOS = locala.vHC.readString();
          return 0;
        case 4: 
          localn.jOU = locala.vHC.readString();
          return 0;
        }
        localn.jPN = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/d/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */