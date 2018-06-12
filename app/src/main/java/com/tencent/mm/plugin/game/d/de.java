package com.tencent.mm.plugin.game.d;

public final class de
  extends com.tencent.mm.bk.a
{
  public String jOT;
  public String jOU;
  public String jPA;
  public int jTt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jOT != null) {
        paramVarArgs.g(1, this.jOT);
      }
      if (this.jOU != null) {
        paramVarArgs.g(2, this.jOU);
      }
      paramVarArgs.fT(3, this.jTt);
      if (this.jPA != null) {
        paramVarArgs.g(4, this.jPA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jOT == null) {
        break label328;
      }
    }
    label328:
    for (paramInt = f.a.a.b.b.a.h(1, this.jOT) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.jOU != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.jOU);
      }
      i += f.a.a.a.fQ(3, this.jTt);
      paramInt = i;
      if (this.jPA != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jPA);
      }
      return paramInt;
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
        de localde = (de)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localde.jOT = locala.vHC.readString();
          return 0;
        case 2: 
          localde.jOU = locala.vHC.readString();
          return 0;
        case 3: 
          localde.jTt = locala.vHC.rY();
          return 0;
        }
        localde.jPA = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */