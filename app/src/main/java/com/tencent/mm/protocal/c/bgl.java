package com.tencent.mm.protocal.c;

public class bgl
  extends com.tencent.mm.bk.a
{
  public int jTf;
  public String riA;
  public long shs;
  public int sht;
  public boolean shu;
  public boolean shv;
  public int shw;
  public boolean shx;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.riA != null) {
        paramVarArgs.g(1, this.riA);
      }
      paramVarArgs.T(2, this.shs);
      paramVarArgs.fT(3, this.sht);
      paramVarArgs.av(4, this.shu);
      paramVarArgs.av(5, this.shv);
      paramVarArgs.fT(6, this.shw);
      paramVarArgs.fT(7, this.jTf);
      paramVarArgs.av(8, this.shx);
      return 0;
    }
    if (paramInt == 1) {
      if (this.riA == null) {
        break label419;
      }
    }
    label419:
    for (paramInt = f.a.a.b.b.a.h(1, this.riA) + 0;; paramInt = 0)
    {
      return paramInt + f.a.a.a.S(2, this.shs) + f.a.a.a.fQ(3, this.sht) + (f.a.a.b.b.a.ec(4) + 1) + (f.a.a.b.b.a.ec(5) + 1) + f.a.a.a.fQ(6, this.shw) + f.a.a.a.fQ(7, this.jTf) + (f.a.a.b.b.a.ec(8) + 1);
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
        bgl localbgl = (bgl)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbgl.riA = locala.vHC.readString();
          return 0;
        case 2: 
          localbgl.shs = locala.vHC.rZ();
          return 0;
        case 3: 
          localbgl.sht = locala.vHC.rY();
          return 0;
        case 4: 
          localbgl.shu = locala.cJQ();
          return 0;
        case 5: 
          localbgl.shv = locala.cJQ();
          return 0;
        case 6: 
          localbgl.shw = locala.vHC.rY();
          return 0;
        case 7: 
          localbgl.jTf = locala.vHC.rY();
          return 0;
        }
        localbgl.shx = locala.cJQ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bgl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */