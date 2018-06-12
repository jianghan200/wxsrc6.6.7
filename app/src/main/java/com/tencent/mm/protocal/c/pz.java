package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class pz
  extends com.tencent.mm.bk.a
{
  public int eJH;
  public String eJM;
  public String hbL;
  public String hcS;
  public String jTB;
  public bhy rcn;
  public String ruh;
  public String rui;
  public int ruj;
  public int ruk;
  public String rul;
  public int rum;
  public String run;
  public String ruo;
  public int rup;
  public int ruq;
  public LinkedList<bhx> rur = new LinkedList();
  public String rus;
  public int rut;
  public int ruu;
  public int ruv;
  public int ruw;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rcn == null) {
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.hcS != null) {
        paramVarArgs.g(2, this.hcS);
      }
      if (this.ruh != null) {
        paramVarArgs.g(3, this.ruh);
      }
      if (this.rui != null) {
        paramVarArgs.g(4, this.rui);
      }
      paramVarArgs.fT(5, this.eJH);
      if (this.rcn != null)
      {
        paramVarArgs.fV(6, this.rcn.boi());
        this.rcn.a(paramVarArgs);
      }
      paramVarArgs.fT(7, this.ruj);
      paramVarArgs.fT(8, this.ruk);
      if (this.rul != null) {
        paramVarArgs.g(9, this.rul);
      }
      paramVarArgs.fT(10, this.rum);
      if (this.run != null) {
        paramVarArgs.g(11, this.run);
      }
      if (this.ruo != null) {
        paramVarArgs.g(12, this.ruo);
      }
      paramVarArgs.fT(13, this.rup);
      paramVarArgs.fT(14, this.ruq);
      paramVarArgs.d(15, 8, this.rur);
      if (this.rus != null) {
        paramVarArgs.g(16, this.rus);
      }
      paramVarArgs.fT(17, this.rut);
      paramVarArgs.fT(18, this.ruu);
      if (this.jTB != null) {
        paramVarArgs.g(19, this.jTB);
      }
      paramVarArgs.fT(20, this.ruv);
      paramVarArgs.fT(21, this.ruw);
      if (this.eJM != null) {
        paramVarArgs.g(22, this.eJM);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label1402;
      }
    }
    label1402:
    for (int i = f.a.a.b.b.a.h(1, this.hbL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.hcS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hcS);
      }
      i = paramInt;
      if (this.ruh != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.ruh);
      }
      paramInt = i;
      if (this.rui != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rui);
      }
      i = paramInt + f.a.a.a.fQ(5, this.eJH);
      paramInt = i;
      if (this.rcn != null) {
        paramInt = i + f.a.a.a.fS(6, this.rcn.boi());
      }
      i = paramInt + f.a.a.a.fQ(7, this.ruj) + f.a.a.a.fQ(8, this.ruk);
      paramInt = i;
      if (this.rul != null) {
        paramInt = i + f.a.a.b.b.a.h(9, this.rul);
      }
      i = paramInt + f.a.a.a.fQ(10, this.rum);
      paramInt = i;
      if (this.run != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.run);
      }
      i = paramInt;
      if (this.ruo != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.ruo);
      }
      i = i + f.a.a.a.fQ(13, this.rup) + f.a.a.a.fQ(14, this.ruq) + f.a.a.a.c(15, 8, this.rur);
      paramInt = i;
      if (this.rus != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.rus);
      }
      i = paramInt + f.a.a.a.fQ(17, this.rut) + f.a.a.a.fQ(18, this.ruu);
      paramInt = i;
      if (this.jTB != null) {
        paramInt = i + f.a.a.b.b.a.h(19, this.jTB);
      }
      i = paramInt + f.a.a.a.fQ(20, this.ruv) + f.a.a.a.fQ(21, this.ruw);
      paramInt = i;
      if (this.eJM != null) {
        paramInt = i + f.a.a.b.b.a.h(22, this.eJM);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rur.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rcn != null) {
          break;
        }
        throw new b("Not all required fields were included: ImgBuf");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        pz localpz = (pz)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localpz.hbL = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localpz.hcS = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 3: 
          localpz.ruh = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localpz.rui = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localpz.eJH = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 6: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhy();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localpz.rcn = ((bhy)localObject1);
            paramInt += 1;
          }
        case 7: 
          localpz.ruj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localpz.ruk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localpz.rul = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 10: 
          localpz.rum = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localpz.run = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localpz.ruo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 13: 
          localpz.rup = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localpz.ruq = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bhx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bhx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localpz.rur.add(localObject1);
            paramInt += 1;
          }
        case 16: 
          localpz.rus = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 17: 
          localpz.rut = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localpz.ruu = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localpz.jTB = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 20: 
          localpz.ruv = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 21: 
          localpz.ruw = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        localpz.eJM = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/pz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */