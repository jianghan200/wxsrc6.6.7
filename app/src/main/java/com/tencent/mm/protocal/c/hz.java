package com.tencent.mm.protocal.c;

public final class hz
  extends com.tencent.mm.bk.a
{
  public String hyG;
  public String riF;
  public int riG;
  public String riJ;
  public String riL;
  public String riT;
  public int ver;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.riL != null) {
        paramVarArgs.g(1, this.riL);
      }
      if (this.hyG != null) {
        paramVarArgs.g(2, this.hyG);
      }
      paramVarArgs.fT(3, this.ver);
      if (this.riF != null) {
        paramVarArgs.g(4, this.riF);
      }
      if (this.riT != null) {
        paramVarArgs.g(5, this.riT);
      }
      paramVarArgs.fT(6, this.riG);
      if (this.riJ != null) {
        paramVarArgs.g(7, this.riJ);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.riL == null) {
        break label481;
      }
    }
    label481:
    for (paramInt = f.a.a.b.b.a.h(1, this.riL) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.hyG != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.hyG);
      }
      i += f.a.a.a.fQ(3, this.ver);
      paramInt = i;
      if (this.riF != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.riF);
      }
      i = paramInt;
      if (this.riT != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.riT);
      }
      i += f.a.a.a.fQ(6, this.riG);
      paramInt = i;
      if (this.riJ != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.riJ);
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
        hz localhz = (hz)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localhz.riL = locala.vHC.readString();
          return 0;
        case 2: 
          localhz.hyG = locala.vHC.readString();
          return 0;
        case 3: 
          localhz.ver = locala.vHC.rY();
          return 0;
        case 4: 
          localhz.riF = locala.vHC.readString();
          return 0;
        case 5: 
          localhz.riT = locala.vHC.readString();
          return 0;
        case 6: 
          localhz.riG = locala.vHC.rY();
          return 0;
        }
        localhz.riJ = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/hz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */