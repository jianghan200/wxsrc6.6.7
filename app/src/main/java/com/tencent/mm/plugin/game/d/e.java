package com.tencent.mm.plugin.game.d;

import f.a.a.b;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.bk.a
{
  public int hcD;
  public int hcd;
  public String jOS;
  public String jOX;
  public String jOZ;
  public String jPc;
  public String jPd;
  public String jPe;
  public String jPf;
  public String jPg;
  public int jPh;
  public q jPi;
  public int jPj;
  public boolean jPk;
  public LinkedList<String> jPl = new LinkedList();
  public boolean jPm;
  public boolean jPn;
  public boolean jPo;
  public boolean jPp;
  public cf jPq;
  public int jPr;
  public bw jPs;
  public LinkedList<String> jPt = new LinkedList();
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.jPc == null) {
        throw new b("Not all required fields were included: AppID");
      }
      if (this.jPd == null) {
        throw new b("Not all required fields were included: IconURL");
      }
      if (this.jPc != null) {
        paramVarArgs.g(1, this.jPc);
      }
      if (this.jPd != null) {
        paramVarArgs.g(2, this.jPd);
      }
      if (this.jPe != null) {
        paramVarArgs.g(3, this.jPe);
      }
      if (this.jOS != null) {
        paramVarArgs.g(4, this.jOS);
      }
      if (this.jPf != null) {
        paramVarArgs.g(5, this.jPf);
      }
      if (this.jOX != null) {
        paramVarArgs.g(6, this.jOX);
      }
      if (this.jPg != null) {
        paramVarArgs.g(7, this.jPg);
      }
      paramVarArgs.fT(8, this.jPh);
      if (this.jPi != null)
      {
        paramVarArgs.fV(9, this.jPi.boi());
        this.jPi.a(paramVarArgs);
      }
      paramVarArgs.fT(10, this.hcd);
      paramVarArgs.fT(11, this.jPj);
      if (this.jOZ != null) {
        paramVarArgs.g(12, this.jOZ);
      }
      paramVarArgs.av(13, this.jPk);
      paramVarArgs.d(14, 1, this.jPl);
      paramVarArgs.av(15, this.jPm);
      paramVarArgs.fT(16, this.hcD);
      paramVarArgs.av(17, this.jPn);
      paramVarArgs.av(18, this.jPo);
      paramVarArgs.av(19, this.jPp);
      if (this.jPq != null)
      {
        paramVarArgs.fV(20, this.jPq.boi());
        this.jPq.a(paramVarArgs);
      }
      paramVarArgs.fT(21, this.jPr);
      if (this.jPs != null)
      {
        paramVarArgs.fV(22, this.jPs.boi());
        this.jPs.a(paramVarArgs);
      }
      paramVarArgs.d(23, 1, this.jPt);
      return 0;
    }
    if (paramInt == 1) {
      if (this.jPc == null) {
        break label1564;
      }
    }
    label1564:
    for (int i = f.a.a.b.b.a.h(1, this.jPc) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPd != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPd);
      }
      i = paramInt;
      if (this.jPe != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jPe);
      }
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOS);
      }
      i = paramInt;
      if (this.jPf != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.jPf);
      }
      paramInt = i;
      if (this.jOX != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jOX);
      }
      i = paramInt;
      if (this.jPg != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.jPg);
      }
      i += f.a.a.a.fQ(8, this.jPh);
      paramInt = i;
      if (this.jPi != null) {
        paramInt = i + f.a.a.a.fS(9, this.jPi.boi());
      }
      i = paramInt + f.a.a.a.fQ(10, this.hcd) + f.a.a.a.fQ(11, this.jPj);
      paramInt = i;
      if (this.jOZ != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.jOZ);
      }
      i = paramInt + (f.a.a.b.b.a.ec(13) + 1) + f.a.a.a.c(14, 1, this.jPl) + (f.a.a.b.b.a.ec(15) + 1) + f.a.a.a.fQ(16, this.hcD) + (f.a.a.b.b.a.ec(17) + 1) + (f.a.a.b.b.a.ec(18) + 1) + (f.a.a.b.b.a.ec(19) + 1);
      paramInt = i;
      if (this.jPq != null) {
        paramInt = i + f.a.a.a.fS(20, this.jPq.boi());
      }
      i = paramInt + f.a.a.a.fQ(21, this.jPr);
      paramInt = i;
      if (this.jPs != null) {
        paramInt = i + f.a.a.a.fS(22, this.jPs.boi());
      }
      return paramInt + f.a.a.a.c(23, 1, this.jPt);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.jPl.clear();
        this.jPt.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.jPc == null) {
          throw new b("Not all required fields were included: AppID");
        }
        if (this.jPd != null) {
          break;
        }
        throw new b("Not all required fields were included: IconURL");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        e locale = (e)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          locale.jPc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          locale.jPd = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          locale.jPe = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          locale.jOS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          locale.jPf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          locale.jOX = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          locale.jPg = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          locale.jPh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new q();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((q)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locale.jPi = ((q)localObject1);
            paramInt += 1;
          }
        case 10: 
          locale.hcd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          locale.jPj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          locale.jOZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          locale.jPk = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 14: 
          locale.jPl.add(((f.a.a.a.a)localObject1).vHC.readString());
          return 0;
        case 15: 
          locale.jPm = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 16: 
          locale.hcD = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          locale.jPn = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 18: 
          locale.jPo = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 19: 
          locale.jPp = ((f.a.a.a.a)localObject1).cJQ();
          return 0;
        case 20: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locale.jPq = ((cf)localObject1);
            paramInt += 1;
          }
        case 21: 
          locale.jPr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 22: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bw();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bw)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            locale.jPs = ((bw)localObject1);
            paramInt += 1;
          }
        }
        locale.jPt.add(((f.a.a.a.a)localObject1).vHC.readString());
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */