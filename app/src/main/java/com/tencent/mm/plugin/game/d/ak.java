package com.tencent.mm.plugin.game.d;

import f.a.a.b;

public final class ak
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOU;
  public String jPA;
  public int jPC;
  public String jQM;
  public boolean jQN;
  public boolean jQO;
  public String jQP;
  public String jQQ;
  public int jQR;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.jQM == null) {
        throw new b("Not all required fields were included: NavKey");
      }
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.jQM != null) {
        paramVarArgs.g(2, this.jQM);
      }
      if (this.jOU != null) {
        paramVarArgs.g(3, this.jOU);
      }
      paramVarArgs.av(4, this.jQN);
      paramVarArgs.av(5, this.jQO);
      if (this.jQP != null) {
        paramVarArgs.g(6, this.jQP);
      }
      if (this.jQQ != null) {
        paramVarArgs.g(7, this.jQQ);
      }
      paramVarArgs.fT(8, this.jQR);
      paramVarArgs.fT(9, this.jPC);
      if (this.jPA != null) {
        paramVarArgs.g(10, this.jPA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label672;
      }
    }
    label672:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jQM != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jQM);
      }
      i = paramInt;
      if (this.jOU != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jOU);
      }
      i = i + (f.a.a.b.b.a.ec(4) + 1) + (f.a.a.b.b.a.ec(5) + 1);
      paramInt = i;
      if (this.jQP != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jQP);
      }
      i = paramInt;
      if (this.jQQ != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.jQQ);
      }
      i = i + f.a.a.a.fQ(8, this.jQR) + f.a.a.a.fQ(9, this.jPC);
      paramInt = i;
      if (this.jPA != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.jPA);
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
        if (this.bHD == null) {
          throw new b("Not all required fields were included: Title");
        }
        if (this.jQM != null) {
          break;
        }
        throw new b("Not all required fields were included: NavKey");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        ak localak = (ak)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localak.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localak.jQM = locala.vHC.readString();
          return 0;
        case 3: 
          localak.jOU = locala.vHC.readString();
          return 0;
        case 4: 
          localak.jQN = locala.cJQ();
          return 0;
        case 5: 
          localak.jQO = locala.cJQ();
          return 0;
        case 6: 
          localak.jQP = locala.vHC.readString();
          return 0;
        case 7: 
          localak.jQQ = locala.vHC.readString();
          return 0;
        case 8: 
          localak.jQR = locala.vHC.rY();
          return 0;
        case 9: 
          localak.jPC = locala.vHC.rY();
          return 0;
        }
        localak.jPA = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/d/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */