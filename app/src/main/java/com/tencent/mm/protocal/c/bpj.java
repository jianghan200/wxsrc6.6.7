package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bpj
  extends bhd
{
  public bhy rTr;
  public int rWb;
  public LinkedList<bot> rWh = new LinkedList();
  public LinkedList<bhz> rWm = new LinkedList();
  public bpi rWn;
  public int rYP;
  public String rcc;
  public bue sdt;
  public bhy smH;
  public int smQ;
  public LinkedList<bhz> smR = new LinkedList();
  public long smU;
  public int smV;
  public LinkedList<bhz> smW = new LinkedList();
  public int smX;
  public bpn smZ;
  public int snp;
  public int snq;
  public int snr;
  public bph sns;
  public bhy snt;
  public String snu;
  public ku snv;
  public int snw;
  public LinkedList<atc> snx = new LinkedList();
  public boj sny;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.smH == null) {
        throw new b("Not all required fields were included: ObjectDesc");
      }
      if (this.shX != null)
      {
        paramVarArgs.fV(1, this.shX.boi());
        this.shX.a(paramVarArgs);
      }
      if (this.smH != null)
      {
        paramVarArgs.fV(2, this.smH.boi());
        this.smH.a(paramVarArgs);
      }
      paramVarArgs.fT(3, this.smQ);
      paramVarArgs.d(4, 8, this.smR);
      paramVarArgs.fT(5, this.snp);
      paramVarArgs.fT(6, this.rWb);
      if (this.rcc != null) {
        paramVarArgs.g(7, this.rcc);
      }
      paramVarArgs.fT(8, this.snq);
      paramVarArgs.fT(9, this.rYP);
      paramVarArgs.d(10, 8, this.rWh);
      paramVarArgs.fT(11, this.snr);
      paramVarArgs.T(12, this.smU);
      paramVarArgs.fT(13, this.smV);
      paramVarArgs.d(14, 8, this.smW);
      if (this.sdt != null)
      {
        paramVarArgs.fV(15, this.sdt.boi());
        this.sdt.a(paramVarArgs);
      }
      paramVarArgs.fT(16, this.smX);
      paramVarArgs.d(17, 8, this.rWm);
      if (this.sns != null)
      {
        paramVarArgs.fV(18, this.sns.boi());
        this.sns.a(paramVarArgs);
      }
      if (this.rWn != null)
      {
        paramVarArgs.fV(19, this.rWn.boi());
        this.rWn.a(paramVarArgs);
      }
      if (this.smZ != null)
      {
        paramVarArgs.fV(20, this.smZ.boi());
        this.smZ.a(paramVarArgs);
      }
      if (this.snt != null)
      {
        paramVarArgs.fV(21, this.snt.boi());
        this.snt.a(paramVarArgs);
      }
      if (this.snu != null) {
        paramVarArgs.g(22, this.snu);
      }
      if (this.snv != null)
      {
        paramVarArgs.fV(23, this.snv.boi());
        this.snv.a(paramVarArgs);
      }
      paramVarArgs.fT(24, this.snw);
      paramVarArgs.d(25, 8, this.snx);
      if (this.sny != null)
      {
        paramVarArgs.fV(26, this.sny.boi());
        this.sny.a(paramVarArgs);
      }
      if (this.rTr != null)
      {
        paramVarArgs.fV(27, this.rTr.boi());
        this.rTr.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.shX == null) {
        break label2811;
      }
    }
    label2811:
    for (paramInt = f.a.a.a.fS(1, this.shX.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.smH != null) {
        i = paramInt + f.a.a.a.fS(2, this.smH.boi());
      }
      i = i + f.a.a.a.fQ(3, this.smQ) + f.a.a.a.c(4, 8, this.smR) + f.a.a.a.fQ(5, this.snp) + f.a.a.a.fQ(6, this.rWb);
      paramInt = i;
      if (this.rcc != null) {
        paramInt = i + f.a.a.b.b.a.h(7, this.rcc);
      }
      i = paramInt + f.a.a.a.fQ(8, this.snq) + f.a.a.a.fQ(9, this.rYP) + f.a.a.a.c(10, 8, this.rWh) + f.a.a.a.fQ(11, this.snr) + f.a.a.a.S(12, this.smU) + f.a.a.a.fQ(13, this.smV) + f.a.a.a.c(14, 8, this.smW);
      paramInt = i;
      if (this.sdt != null) {
        paramInt = i + f.a.a.a.fS(15, this.sdt.boi());
      }
      i = paramInt + f.a.a.a.fQ(16, this.smX) + f.a.a.a.c(17, 8, this.rWm);
      paramInt = i;
      if (this.sns != null) {
        paramInt = i + f.a.a.a.fS(18, this.sns.boi());
      }
      i = paramInt;
      if (this.rWn != null) {
        i = paramInt + f.a.a.a.fS(19, this.rWn.boi());
      }
      paramInt = i;
      if (this.smZ != null) {
        paramInt = i + f.a.a.a.fS(20, this.smZ.boi());
      }
      i = paramInt;
      if (this.snt != null) {
        i = paramInt + f.a.a.a.fS(21, this.snt.boi());
      }
      paramInt = i;
      if (this.snu != null) {
        paramInt = i + f.a.a.b.b.a.h(22, this.snu);
      }
      i = paramInt;
      if (this.snv != null) {
        i = paramInt + f.a.a.a.fS(23, this.snv.boi());
      }
      i = i + f.a.a.a.fQ(24, this.snw) + f.a.a.a.c(25, 8, this.snx);
      paramInt = i;
      if (this.sny != null) {
        paramInt = i + f.a.a.a.fS(26, this.sny.boi());
      }
      i = paramInt;
      if (this.rTr != null) {
        i = paramInt + f.a.a.a.fS(27, this.rTr.boi());
      }
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.smR.clear();
        this.rWh.clear();
        this.smW.clear();
        this.rWm.clear();
        this.snx.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhd.a(paramVarArgs); paramInt > 0; paramInt = bhd.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.smH != null) {
          break;
        }
        throw new b("Not all required fields were included: ObjectDesc");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bpj localbpj = (bpj)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fk();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fk)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.shX = ((fk)localObject1);
            paramInt += 1;
          }
        case 2: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.smH = ((bhy)localObject1);
            paramInt += 1;
          }
        case 3: 
          localbpj.smQ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.smR.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localbpj.snp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          localbpj.rWb = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          localbpj.rcc = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localbpj.snq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbpj.rYP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bot();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bot)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.rWh.add(localObject1);
            paramInt += 1;
          }
        case 11: 
          localbpj.snr = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbpj.smU = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 13: 
          localbpj.smV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.smW.add(localObject1);
            paramInt += 1;
          }
        case 15: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bue();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bue)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.sdt = ((bue)localObject1);
            paramInt += 1;
          }
        case 16: 
          localbpj.smX = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhz();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhz)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.rWm.add(localObject1);
            paramInt += 1;
          }
        case 18: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bph();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bph)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.sns = ((bph)localObject1);
            paramInt += 1;
          }
        case 19: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bpi();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bpi)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.rWn = ((bpi)localObject1);
            paramInt += 1;
          }
        case 20: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bpn();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bpn)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.smZ = ((bpn)localObject1);
            paramInt += 1;
          }
        case 21: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.snt = ((bhy)localObject1);
            paramInt += 1;
          }
        case 22: 
          localbpj.snu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 23: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new ku();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ku)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.snv = ((ku)localObject1);
            paramInt += 1;
          }
        case 24: 
          localbpj.snw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 25: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new atc();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((atc)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.snx.add(localObject1);
            paramInt += 1;
          }
        case 26: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new boj();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((boj)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
            localbpj.sny = ((boj)localObject1);
            paramInt += 1;
          }
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhd.a((f.a.a.a.a)localObject2))) {}
          localbpj.rTr = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bpj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */