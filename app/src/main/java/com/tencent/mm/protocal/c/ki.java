package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class ki
  extends bhd
{
  public String jQb;
  public String jTu;
  public String jTv;
  public int otY;
  public String raM;
  public String raN;
  public String raO;
  public String rco;
  public int rdq;
  public int rmA;
  public int rmB;
  public String rmn;
  public int rmo;
  public int rmp;
  public bhy rmq;
  public float rmr;
  public float rms;
  public String rmt;
  public int rmu;
  public int rmv;
  public int rmw;
  public int rmx;
  public String rmy;
  public int rmz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rmn != null) {
        paramVarArgs.g(1, this.rmn);
      }
      if (this.jTv != null) {
        paramVarArgs.g(2, this.jTv);
      }
      if (this.jTu != null) {
        paramVarArgs.g(3, this.jTu);
      }
      paramVarArgs.fT(4, this.rmo);
      paramVarArgs.fT(5, this.rmp);
      if (this.rco != null) {
        paramVarArgs.g(6, this.rco);
      }
      if (this.rmq != null)
      {
        paramVarArgs.fV(7, this.rmq.boi());
        this.rmq.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.otY);
      paramVarArgs.l(9, this.rmr);
      paramVarArgs.l(10, this.rms);
      if (this.rmt != null) {
        paramVarArgs.g(11, this.rmt);
      }
      paramVarArgs.fT(12, this.rmu);
      paramVarArgs.fT(13, this.rmv);
      paramVarArgs.fT(14, this.rmw);
      paramVarArgs.fT(15, this.rmx);
      if (this.rmy != null) {
        paramVarArgs.g(16, this.rmy);
      }
      paramVarArgs.fT(17, this.rmz);
      paramVarArgs.fT(18, this.rmA);
      paramVarArgs.fT(19, this.rmB);
      paramVarArgs.fT(20, this.rdq);
      if (this.jQb != null) {
        paramVarArgs.g(21, this.jQb);
      }
      if (this.raO != null) {
        paramVarArgs.g(22, this.raO);
      }
      if (this.raN != null) {
        paramVarArgs.g(23, this.raN);
      }
      if (this.raM != null) {
        paramVarArgs.g(24, this.raM);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rmn == null) {
        break label1346;
      }
    }
    label1346:
    for (int i = f.a.a.b.b.a.h(1, this.rmn) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jTv != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jTv);
      }
      i = paramInt;
      if (this.jTu != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jTu);
      }
      i = i + f.a.a.a.fQ(4, this.rmo) + f.a.a.a.fQ(5, this.rmp);
      paramInt = i;
      if (this.rco != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rco);
      }
      i = paramInt;
      if (this.rmq != null) {
        i = paramInt + f.a.a.a.fS(7, this.rmq.boi());
      }
      i = i + f.a.a.a.fQ(8, this.otY) + (f.a.a.b.b.a.ec(9) + 4) + (f.a.a.b.b.a.ec(10) + 4);
      paramInt = i;
      if (this.rmt != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.rmt);
      }
      i = paramInt + f.a.a.a.fQ(12, this.rmu) + f.a.a.a.fQ(13, this.rmv) + f.a.a.a.fQ(14, this.rmw) + f.a.a.a.fQ(15, this.rmx);
      paramInt = i;
      if (this.rmy != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.rmy);
      }
      i = paramInt + f.a.a.a.fQ(17, this.rmz) + f.a.a.a.fQ(18, this.rmA) + f.a.a.a.fQ(19, this.rmB) + f.a.a.a.fQ(20, this.rdq);
      paramInt = i;
      if (this.jQb != null) {
        paramInt = i + f.a.a.b.b.a.h(21, this.jQb);
      }
      i = paramInt;
      if (this.raO != null) {
        i = paramInt + f.a.a.b.b.a.h(22, this.raO);
      }
      paramInt = i;
      if (this.raN != null) {
        paramInt = i + f.a.a.b.b.a.h(23, this.raN);
      }
      i = paramInt;
      if (this.raM != null) {
        i = paramInt + f.a.a.b.b.a.h(24, this.raM);
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ki localki = (ki)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localki.rmn = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localki.jTv = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localki.jTu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localki.rmo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localki.rmp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localki.rco = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localki.rmq = ((bhy)localObject1);
            paramInt += 1;
          }
        case 8: 
          localki.otY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localki.rmr = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 10: 
          localki.rms = ((f.a.a.a.a)localObject1).vHC.readFloat();
          return 0;
        case 11: 
          localki.rmt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localki.rmu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localki.rmv = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localki.rmw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localki.rmx = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localki.rmy = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localki.rmz = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localki.rmA = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localki.rmB = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 20: 
          localki.rdq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 21: 
          localki.jQb = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 22: 
          localki.raO = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 23: 
          localki.raN = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localki.raM = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */