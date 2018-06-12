package com.tencent.mm.plugin.game.d;

public final class am
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String jOU;
  public String jQV;
  public String jQb;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jQV != null) {
        paramVarArgs.g(1, this.jQV);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.jOS != null) {
        paramVarArgs.g(3, this.jOS);
      }
      if (this.jOU != null) {
        paramVarArgs.g(4, this.jOU);
      }
      if (this.jQb != null) {
        paramVarArgs.g(5, this.jQb);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.jQV == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.jQV) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.jOS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jOS);
      }
      paramInt = i;
      if (this.jOU != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOU);
      }
      i = paramInt;
      if (this.jQb != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jQb);
      }
      return i;
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
        am localam = (am)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localam.jQV = locala.vHC.readString();
          return 0;
        case 2: 
          localam.bHD = locala.vHC.readString();
          return 0;
        case 3: 
          localam.jOS = locala.vHC.readString();
          return 0;
        case 4: 
          localam.jOU = locala.vHC.readString();
          return 0;
        }
        localam.jQb = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */