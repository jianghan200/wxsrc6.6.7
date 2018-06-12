package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class cu
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public int jTf;
  public long jTg;
  public String jTh;
  public boolean jTi;
  public int jTj;
  public String jTk;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL == null) {
        throw new b("Not all required fields were included: UserName");
      }
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      paramVarArgs.fT(2, this.jTf);
      paramVarArgs.T(3, this.jTg);
      if (this.jTh != null) {
        paramVarArgs.g(4, this.jTh);
      }
      paramVarArgs.av(5, this.jTi);
      paramVarArgs.fT(6, this.jTj);
      if (this.jTk != null) {
        paramVarArgs.g(7, this.jTk);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label474;
      }
    }
    label474:
    for (paramInt = f.a.a.b.b.a.h(1, this.hbL) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.jTf) + f.a.a.a.S(3, this.jTg);
      paramInt = i;
      if (this.jTh != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jTh);
      }
      i = paramInt + (f.a.a.b.b.a.ec(5) + 1) + f.a.a.a.fQ(6, this.jTj);
      paramInt = i;
      if (this.jTk != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.jTk);
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
        if (this.hbL != null) {
          break;
        }
        throw new b("Not all required fields were included: UserName");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        cu localcu = (cu)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcu.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localcu.jTf = locala.vHC.rY();
          return 0;
        case 3: 
          localcu.jTg = locala.vHC.rZ();
          return 0;
        case 4: 
          localcu.jTh = locala.vHC.readString();
          return 0;
        case 5: 
          localcu.jTi = locala.cJQ();
          return 0;
        case 6: 
          localcu.jTj = locala.vHC.rY();
          return 0;
        }
        localcu.jTk = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/d/cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */