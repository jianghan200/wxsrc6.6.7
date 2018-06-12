package com.tencent.mm.plugin.game.d;

public final class bt
  extends com.tencent.mm.bk.a
{
  public String desc;
  public String dvS;
  public String jSq;
  public String jSr;
  public String title;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.title != null) {
        paramVarArgs.g(1, this.title);
      }
      if (this.dvS != null) {
        paramVarArgs.g(2, this.dvS);
      }
      if (this.jSq != null) {
        paramVarArgs.g(3, this.jSq);
      }
      if (this.desc != null) {
        paramVarArgs.g(4, this.desc);
      }
      if (this.jSr != null) {
        paramVarArgs.g(5, this.jSr);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.title == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.title) + 0;; i = 0)
    {
      paramInt = i;
      if (this.dvS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.dvS);
      }
      i = paramInt;
      if (this.jSq != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jSq);
      }
      paramInt = i;
      if (this.desc != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.desc);
      }
      i = paramInt;
      if (this.jSr != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jSr);
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
        bt localbt = (bt)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbt.title = locala.vHC.readString();
          return 0;
        case 2: 
          localbt.dvS = locala.vHC.readString();
          return 0;
        case 3: 
          localbt.jSq = locala.vHC.readString();
          return 0;
        case 4: 
          localbt.desc = locala.vHC.readString();
          return 0;
        }
        localbt.jSr = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/d/bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */