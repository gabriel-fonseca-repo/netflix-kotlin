package com.gabriel.augusto.netflox

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.gabriel.augusto.netflox.databinding.FilmeViewBinding

class FilmeView : Fragment() {

    val filme1 = FilmeVo(1,"Breaking bad","Breaking Bad retrata a vida do químico Walter White," +
            " um homem brilhante, mas frustrado por dar aulas para adolescentes do ensino médio, enquanto precisa lidar com um filho que tem " +
            "paralisia cerebral, uma esposa grávida e muitas dívidas.", R.drawable.breaking_bad_poster)
    val filme2 = FilmeVo(2,"ET", "O garoto Elliott faz amizade com um pequeno alienígena inofensivo que está bem longe do seu planeta. " +
            "Ele decide manter a adorável criatura em segredo e em casa após apresentá-la aos " +
            "irmãos.", R.drawable.et_poster)
    val filme3 = FilmeVo(3, "Freedom","Sinopse", R.drawable.freedom_poster)
    val filme4 = FilmeVo(4, "Coringa","Isolado, intimidado e desconsiderado pela sociedade, o fracassado comediante Arthur Fleck inicia seu caminho como uma mente criminosa após assassinar três homens em pleno metrô. Sua ação inicia um movimento popular " +
            "contra a elite de Gotham City, da qual Thomas" +
            " Wayne é seu maior representante.", R.drawable.joker_poster)
    val filme5 = FilmeVo(5, "Replicas","Sinopse", R.drawable.replica_poster)
    val filme6 = FilmeVo(6, "Pantera Negra","Conheça a história de T'Challa, príncipe do reino de Wakanda, que perde o seu pai e viaja para os Estados Unidos, onde tem contato com os Vingadores. " +
            "Entre as suas habilidades estão a velocidade, " +
            "inteligência e os sentidos apurados.", R.drawable.pantera_negra_poster)

    val filmes = arrayOf(filme1, filme2, filme3, filme4, filme5, filme6)

    private var _binding: FilmeViewBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FilmeViewBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle = arguments;

        if (bundle == null) {
            Log.d("impossivel", "eita")
            return
        }

        val args = FilmeViewArgs.fromBundle(bundle)

        val filme = filmes.get(args.idFilme - 1)
        val nomeDoFilme: TextView = view.findViewById(R.id.textview_second) as TextView
        val sinopse: TextView = view.findViewById(R.id.textView) as TextView
        val imagem: ImageView = view.findViewById(R.id.imageView) as ImageView
        nomeDoFilme.setText(filme.nomeDoFilme)
        sinopse.setText(filme.sinopse)
        imagem.setImageResource(filme.imagem)

        println(args.idFilme)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.voltar_para_lista)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}