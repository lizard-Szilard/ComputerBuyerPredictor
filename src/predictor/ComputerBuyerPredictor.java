package predictor;

public class ComputerBuyerPredictor {

	public boolean predict(int umurSeseorang, int statusPelajar, int tingkatPelunasanKredit) {
		
		/*
		Diberikan karakteristik seseorang yang berpotensi membeli komputer:
		1. Umur dewasa, atau
		2. Umur muda dan seorang pelajar, atau
		3. Umur tua dan tingkat pelunasan kredit baik
		
		1. Umur (Untuk input umur berupa bilangan bulat 0,1, atau 2. Angka 0 mewakili muda. Angka 1 mewakili dewasa. Angka 2 mewakili tua) .
		2. status pelajar ( Untuk input status pelajar berupa bilangan bulat 0 atau 1. Angka 0 mewakili pelajar. Angka 1 mewakili bukan pelajar)
		3. tingkat pelunasan kredit (Untuk input tingkat pelunasan kredit berupa bilangan bulat 0 atau 1. Angka 0 mewakili baik. Angka 1 mewakili buruk)
		 */
		if (umurSeseorang == 0 || umurSeseorang == 2 || statusPelajar == 1 || statusPelajar == 0 || tingkatPelunasanKredit == 0 ){
			return true;
		}else{
			return false;
		}

	}

}
