package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public class if
  extends com.tencent.mm.bk.a
{
  public long bIZ;
  public int cancel;
  public int pos;
  public String rjm;
  public LinkedList<Integer> rjn = new LinkedList();
  public int rjo;
  public int rjp;
  public int rjq;
  public int rjr;
  public int rjs;
  public int rjt;
  public int rju;
  public int rjv;
  public int rjw;
  public int rjx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rjm != null) {
        paramVarArgs.g(1, this.rjm);
      }
      paramVarArgs.T(2, this.bIZ);
      paramVarArgs.fT(3, this.pos);
      paramVarArgs.d(4, 2, this.rjn);
      paramVarArgs.fT(5, this.rjo);
      paramVarArgs.fT(6, this.rjp);
      paramVarArgs.fT(7, this.rjq);
      paramVarArgs.fT(8, this.rjr);
      paramVarArgs.fT(9, this.rjs);
      paramVarArgs.fT(10, this.rjt);
      paramVarArgs.fT(11, this.rju);
      paramVarArgs.fT(12, this.rjv);
      paramVarArgs.fT(13, this.rjw);
      paramVarArgs.fT(14, this.cancel);
      paramVarArgs.fT(15, this.rjx);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rjm == null) {
        break label717;
      }
    }
    label717:
    for (paramInt = f.a.a.b.b.a.h(1, this.rjm) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.S(2, this.bIZ) + f.a.a.a.fQ(3, this.pos) + f.a.a.a.c(4, 2, this.rjn) + f.a.a.a.fQ(5, this.rjo) + f.a.a.a.fQ(6, this.rjp) + f.a.a.a.fQ(7, this.rjq) + f.a.a.a.fQ(8, this.rjr) + f.a.a.a.fQ(9, this.rjs) + f.a.a.a.fQ(10, this.rjt) + f.a.a.a.fQ(11, this.rju) + f.a.a.a.fQ(12, this.rjv) + f.a.a.a.fQ(13, this.rjw) + f.a.a.a.fQ(14, this.cancel) + f.a.a.a.fQ(15, this.rjx);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rjn.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
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
        if localif = (if)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localif.rjm = locala.vHC.readString();
          return 0;
        case 2: 
          localif.bIZ = locala.vHC.rZ();
          return 0;
        case 3: 
          localif.pos = locala.vHC.rY();
          return 0;
        case 4: 
          localif.rjn.add(Integer.valueOf(locala.vHC.rY()));
          return 0;
        case 5: 
          localif.rjo = locala.vHC.rY();
          return 0;
        case 6: 
          localif.rjp = locala.vHC.rY();
          return 0;
        case 7: 
          localif.rjq = locala.vHC.rY();
          return 0;
        case 8: 
          localif.rjr = locala.vHC.rY();
          return 0;
        case 9: 
          localif.rjs = locala.vHC.rY();
          return 0;
        case 10: 
          localif.rjt = locala.vHC.rY();
          return 0;
        case 11: 
          localif.rju = locala.vHC.rY();
          return 0;
        case 12: 
          localif.rjv = locala.vHC.rY();
          return 0;
        case 13: 
          localif.rjw = locala.vHC.rY();
          return 0;
        case 14: 
          localif.cancel = locala.vHC.rY();
          return 0;
        }
        localif.rjx = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/if.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */