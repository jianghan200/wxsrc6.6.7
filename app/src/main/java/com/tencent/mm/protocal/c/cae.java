package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class cae
  extends bhp
{
  public int rfh;
  public LinkedList<byx> rfi = new LinkedList();
  public int rxG;
  public long rxH;
  public int seq;
  public caf suQ;
  public int suR;
  public int suS;
  public int suT;
  public int suU;
  public bhy suV;
  public int svY;
  public int svZ;
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
  public int swa;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.rxG);
      paramVarArgs.fT(3, this.rfh);
      paramVarArgs.d(4, 8, this.rfi);
      paramVarArgs.T(5, this.rxH);
      paramVarArgs.fT(6, this.seq);
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
      paramVarArgs.fT(14, this.svY);
      paramVarArgs.fT(15, this.svg);
      paramVarArgs.fT(16, this.svh);
      paramVarArgs.fT(17, this.suR);
      paramVarArgs.fT(18, this.svi);
      paramVarArgs.fT(19, this.svj);
      paramVarArgs.fT(20, this.suS);
      paramVarArgs.fT(21, this.svk);
      paramVarArgs.fT(22, this.svl);
      paramVarArgs.fT(23, this.svm);
      paramVarArgs.fT(24, this.svZ);
      paramVarArgs.fT(25, this.svn);
      paramVarArgs.fT(26, this.swa);
      paramVarArgs.fT(27, this.suT);
      paramVarArgs.fT(28, this.suU);
      paramVarArgs.fT(29, this.svo);
      paramVarArgs.fT(30, this.svp);
      if (this.suV != null)
      {
        paramVarArgs.fV(31, this.suV.boi());
        this.suV.a(paramVarArgs);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label1879;
      }
    }
    label1879:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.rxG) + f.a.a.a.fQ(3, this.rfh) + f.a.a.a.c(4, 8, this.rfi) + f.a.a.a.S(5, this.rxH) + f.a.a.a.fQ(6, this.seq);
      paramInt = i;
      if (this.suQ != null) {
        paramInt = i + f.a.a.a.fS(7, this.suQ.boi());
      }
      i = paramInt + f.a.a.a.fQ(8, this.sva) + f.a.a.a.c(9, 8, this.svb) + f.a.a.a.fQ(10, this.svc) + f.a.a.a.fQ(11, this.svd) + f.a.a.a.fQ(12, this.sve) + f.a.a.a.fQ(13, this.svf) + f.a.a.a.fQ(14, this.svY) + f.a.a.a.fQ(15, this.svg) + f.a.a.a.fQ(16, this.svh) + f.a.a.a.fQ(17, this.suR) + f.a.a.a.fQ(18, this.svi) + f.a.a.a.fQ(19, this.svj) + f.a.a.a.fQ(20, this.suS) + f.a.a.a.fQ(21, this.svk) + f.a.a.a.fQ(22, this.svl) + f.a.a.a.fQ(23, this.svm) + f.a.a.a.fQ(24, this.svZ) + f.a.a.a.fQ(25, this.svn) + f.a.a.a.fQ(26, this.swa) + f.a.a.a.fQ(27, this.suT) + f.a.a.a.fQ(28, this.suU) + f.a.a.a.fQ(29, this.svo) + f.a.a.a.fQ(30, this.svp);
      paramInt = i;
      if (this.suV != null) {
        paramInt = i + f.a.a.a.fS(31, this.suV.boi());
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
        if (this.six != null) {
          break;
        }
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        cae localcae = (cae)paramVarArgs[1];
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
            localcae.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localcae.rxG = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localcae.rfh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 4: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new byx();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((byx)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localcae.rfi.add(localObject1);
            paramInt += 1;
          }
        case 5: 
          localcae.rxH = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localcae.seq = ((f.a.a.a.a)localObject1).vHC.rY();
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
            localcae.suQ = ((caf)localObject1);
            paramInt += 1;
          }
        case 8: 
          localcae.sva = ((f.a.a.a.a)localObject1).vHC.rY();
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
            localcae.svb.add(localObject1);
            paramInt += 1;
          }
        case 10: 
          localcae.svc = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localcae.svd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 12: 
          localcae.sve = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 13: 
          localcae.svf = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 14: 
          localcae.svY = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 15: 
          localcae.svg = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 16: 
          localcae.svh = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 17: 
          localcae.suR = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 18: 
          localcae.svi = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 19: 
          localcae.svj = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 20: 
          localcae.suS = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 21: 
          localcae.svk = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 22: 
          localcae.svl = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 23: 
          localcae.svm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 24: 
          localcae.svZ = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 25: 
          localcae.svn = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 26: 
          localcae.swa = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 27: 
          localcae.suT = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 28: 
          localcae.suU = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 29: 
          localcae.svo = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 30: 
          localcae.svp = ((f.a.a.a.a)localObject1).vHC.rY();
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
          localcae.suV = ((bhy)localObject1);
          paramInt += 1;
        }
        break;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */