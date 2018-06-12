package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class bza
  extends bhp
{
  public int rfh;
  public LinkedList<byx> rfi = new LinkedList();
  public int rxG;
  public long rxH;
  public int suP;
  public caf suQ;
  public int suR;
  public int suS;
  public int suT;
  public int suU;
  public bhy suV;
  public int sva;
  public LinkedList<cag> svb = new LinkedList();
  public int svc;
  public int svd;
  public int sve;
  public int svf;
  public int svg;
  public int svh;
  public int svi;
  public int svj;
  public int svk;
  public int svl;
  public int svm;
  public int svn;
  public int svo;
  public int svp;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.suQ == null) {
        throw new b("Not all required fields were included: RelayData");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rfh);
      paramVarArgs.d(3, 8, this.rfi);
      paramVarArgs.fT(4, this.rxG);
      paramVarArgs.T(5, this.rxH);
      paramVarArgs.fT(6, this.suP);
      if (this.suQ != null)
      {
        paramVarArgs.fV(7, this.suQ.boi());
        this.suQ.a(paramVarArgs);
      }
      paramVarArgs.fT(8, this.sva);
      paramVarArgs.d(9, 8, this.svb);
      paramVarArgs.fT(10, this.svc);
      paramVarArgs.fT(11, this.svd);
      paramVarArgs.fT(12, this.sve);
      paramVarArgs.fT(13, this.svf);
      paramVarArgs.fT(14, this.svg);
      paramVarArgs.fT(15, this.svh);
      paramVarArgs.fT(16, this.suR);
      paramVarArgs.fT(17, this.svi);
      paramVarArgs.fT(18, this.svj);
      paramVarArgs.fT(19, this.suS);
      paramVarArgs.fT(20, this.svk);
      paramVarArgs.fT(21, this.svl);
      paramVarArgs.fT(22, this.svm);
      paramVarArgs.fT(23, this.svn);
      paramVarArgs.fT(24, this.suT);
      paramVarArgs.fT(25, this.suU);
      paramVarArgs.fT(26, this.svo);
      paramVarArgs.fT(27, this.svp);
      if (this.suV != null)
      {
        paramVarArgs.fV(28, this.suV.boi());
        this.suV.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1798;
      }
    }
    label1798:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rfh) + f.a.a.a.c(3, 8, this.rfi) + f.a.a.a.fQ(4, this.rxG) + f.a.a.a.S(5, this.rxH) + f.a.a.a.fQ(6, this.suP);
      paramInt = i;
      if (this.suQ != null) {
        paramInt = i + f.a.a.a.fS(7, this.suQ.boi());
      }
      i = paramInt + f.a.a.a.fQ(8, this.sva) + f.a.a.a.c(9, 8, this.svb) + f.a.a.a.fQ(10, this.svc) + f.a.a.a.fQ(11, this.svd) + f.a.a.a.fQ(12, this.sve) + f.a.a.a.fQ(13, this.svf) + f.a.a.a.fQ(14, this.svg) + f.a.a.a.fQ(15, this.svh) + f.a.a.a.fQ(16, this.suR) + f.a.a.a.fQ(17, this.svi) + f.a.a.a.fQ(18, this.svj) + f.a.a.a.fQ(19, this.suS) + f.a.a.a.fQ(20, this.svk) + f.a.a.a.fQ(21, this.svl) + f.a.a.a.fQ(22, this.svm) + f.a.a.a.fQ(23, this.svn) + f.a.a.a.fQ(24, this.suT) + f.a.a.a.fQ(25, this.suU) + f.a.a.a.fQ(26, this.svo) + f.a.a.a.fQ(27, this.svp);
      paramInt = i;
      if (this.suV != null) {
        paramInt = i + f.a.a.a.fS(28, this.suV.boi());
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.rfi.clear();
        this.svb.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six == null) {
          throw new b("Not all required fields were included: BaseResponse");
        }
        if (this.suQ != null) {
          break;
        }
        throw new b("Not all required fields were included: RelayData");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bza localbza = (bza)paramVarArgs[1];
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
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbza.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbza.rfh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbza.rfi.add(localObject1);
            paramInt += 1;
          }
        case 4: 
          localbza.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          localbza.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localbza.suP = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 7: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new caf();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((caf)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbza.suQ = ((caf)localObject1);
            paramInt += 1;
          }
        case 8: 
          localbza.sva = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new cag();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cag)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbza.svb.add(localObject1);
            paramInt += 1;
          }
        case 10: 
          localbza.svc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbza.svd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localbza.sve = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localbza.svf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localbza.svg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localbza.svh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localbza.suR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localbza.svi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localbza.svj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localbza.suS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 20: 
          localbza.svk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 21: 
          localbza.svl = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 22: 
          localbza.svm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 23: 
          localbza.svn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 24: 
          localbza.suT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 25: 
          localbza.suU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 26: 
          localbza.svo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 27: 
          localbza.svp = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        }
        paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bhy();
          localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bhy)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
          localbza.suV = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */