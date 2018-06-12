package com.tencent.mm.protocal.c;

public final class amp
  extends com.tencent.mm.bk.a
{
  public int create_time;
  public int huK;
  public int huV;
  public String hwg;
  public String kLf;
  public String lMY;
  public String muD;
  public String qYy;
  public String rIw;
  public long rPl;
  public String rPn;
  public int rPp;
  public int rPq;
  public String rPr;
  public int state;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rIw != null) {
        paramVarArgs.g(1, this.rIw);
      }
      if (this.qYy != null) {
        paramVarArgs.g(2, this.qYy);
      }
      paramVarArgs.T(3, this.rPl);
      paramVarArgs.fT(4, this.state);
      paramVarArgs.fT(5, this.create_time);
      paramVarArgs.fT(6, this.huK);
      paramVarArgs.fT(7, this.rPp);
      paramVarArgs.fT(8, this.rPq);
      if (this.rPr != null) {
        paramVarArgs.g(9, this.rPr);
      }
      if (this.hwg != null) {
        paramVarArgs.g(10, this.hwg);
      }
      if (this.kLf != null) {
        paramVarArgs.g(11, this.kLf);
      }
      if (this.lMY != null) {
        paramVarArgs.g(12, this.lMY);
      }
      if (this.muD != null) {
        paramVarArgs.g(13, this.muD);
      }
      if (this.rPn != null) {
        paramVarArgs.g(14, this.rPn);
      }
      paramVarArgs.fT(15, this.huV);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rIw == null) {
        break label845;
      }
    }
    label845:
    for (paramInt = f.a.a.b.b.a.h(1, this.rIw) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.qYy != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.qYy);
      }
      i = i + f.a.a.a.S(3, this.rPl) + f.a.a.a.fQ(4, this.state) + f.a.a.a.fQ(5, this.create_time) + f.a.a.a.fQ(6, this.huK) + f.a.a.a.fQ(7, this.rPp) + f.a.a.a.fQ(8, this.rPq);
      paramInt = i;
      if (this.rPr != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rPr);
      }
      i = paramInt;
      if (this.hwg != null) {
        i = paramInt + f.a.a.b.b.a.h(10, this.hwg);
      }
      paramInt = i;
      if (this.kLf != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.kLf);
      }
      i = paramInt;
      if (this.lMY != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.lMY);
      }
      paramInt = i;
      if (this.muD != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.muD);
      }
      i = paramInt;
      if (this.rPn != null) {
        i = paramInt + f.a.a.b.b.a.h(14, this.rPn);
      }
      return i + f.a.a.a.fQ(15, this.huV);
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
        amp localamp = (amp)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localamp.rIw = locala.vHC.readString();
          return 0;
        case 2: 
          localamp.qYy = locala.vHC.readString();
          return 0;
        case 3: 
          localamp.rPl = locala.vHC.rZ();
          return 0;
        case 4: 
          localamp.state = locala.vHC.rY();
          return 0;
        case 5: 
          localamp.create_time = locala.vHC.rY();
          return 0;
        case 6: 
          localamp.huK = locala.vHC.rY();
          return 0;
        case 7: 
          localamp.rPp = locala.vHC.rY();
          return 0;
        case 8: 
          localamp.rPq = locala.vHC.rY();
          return 0;
        case 9: 
          localamp.rPr = locala.vHC.readString();
          return 0;
        case 10: 
          localamp.hwg = locala.vHC.readString();
          return 0;
        case 11: 
          localamp.kLf = locala.vHC.readString();
          return 0;
        case 12: 
          localamp.lMY = locala.vHC.readString();
          return 0;
        case 13: 
          localamp.muD = locala.vHC.readString();
          return 0;
        case 14: 
          localamp.rPn = locala.vHC.readString();
          return 0;
        }
        localamp.huV = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/amp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */