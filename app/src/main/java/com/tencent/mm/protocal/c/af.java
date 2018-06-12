package com.tencent.mm.protocal.c;

public final class af
  extends com.tencent.mm.bk.a
{
  public String qZE;
  public int qZF;
  public int qZG;
  public int qZH;
  public int qZI;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.qZE != null) {
        paramVarArgs.g(1, this.qZE);
      }
      paramVarArgs.fT(2, this.qZF);
      paramVarArgs.fT(3, this.qZG);
      paramVarArgs.fT(4, this.qZH);
      paramVarArgs.fT(5, this.qZI);
      return 0;
    }
    if (paramInt == 1) {
      if (this.qZE == null) {
        break label318;
      }
    }
    label318:
    for (paramInt = f.a.a.b.b.a.h(1, this.qZE) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.fQ(2, this.qZF) + f.a.a.a.fQ(3, this.qZG) + f.a.a.a.fQ(4, this.qZH) + f.a.a.a.fQ(5, this.qZI);
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
        af localaf = (af)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaf.qZE = locala.vHC.readString();
          return 0;
        case 2: 
          localaf.qZF = locala.vHC.rY();
          return 0;
        case 3: 
          localaf.qZG = locala.vHC.rY();
          return 0;
        case 4: 
          localaf.qZH = locala.vHC.rY();
          return 0;
        }
        localaf.qZI = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */